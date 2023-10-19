package com.ning.matomochatgpt.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ning.matomochatgpt.config.ConfigClient;
import com.ning.matomochatgpt.entity.MatomoRequestParam;
import com.ning.matomochatgpt.entity.MatomoResponse;
import com.ning.matomochatgpt.http.api.MatomoApi;
import com.ning.matomochatgpt.http.client.MatomoClient;
import com.ning.matomochatgpt.service.MatomoGptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName: MatomoGpt <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/18 0018
 * @since JDK 11
 */
@RestController
@RequestMapping("/matomo")
@Api(value = "Matomo AI",tags = "Matomo-AI接口")
public class MatomoGpt {

    private final MatomoGptService matomoGptService;
    private final ConfigClient configClient;

    public MatomoGpt(ConfigClient configClient, MatomoGptService matomoGptService) {
        this.configClient = configClient;
        this.matomoGptService = matomoGptService;
    }

    @ApiOperation(value = "网站分析",notes = "分析Matomo提供的API数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "url",value = "Matomo的Api地址"),
            @ApiImplicitParam(name = "token_auth",value = "Matomo的Token字段，用于校验Matomo网站所有权"),
            @ApiImplicitParam(name = "idSite",value = "Matomo网站的编号"),
            @ApiImplicitParam(name = "period",value = "网站数据的时间段，填day、week、month、year或range"),
            @ApiImplicitParam(name = "date",value = "具体时间，格式：yyyy-MM-dd"),
            @ApiImplicitParam(name = "segment",value = "用于自定义过滤"),
            @ApiImplicitParam(name = "filterLimit",value = "数据量，默认100，-1为全部"),
            @ApiImplicitParam(name = "method",value = "Matomo 的 API方法"),
            @ApiImplicitParam(name = "module",value = "默认为API"),
            @ApiImplicitParam(name = "format",value = "Matomo的数据格式")
    })

    @PostMapping("/analyze")
    public Object matomoAnalyze(
            @RequestParam(value = "url",defaultValue = "") String url,
            @RequestParam(value = "token_auth",defaultValue = "") String token_auth,
            @RequestParam("idSite") String idSite,
            @RequestParam(value = "period",defaultValue = "month") String period,
            @RequestParam(value = "date") String date,
            @RequestParam(value = "segment",defaultValue = "") String segment,
            @RequestParam(value = "filterLimit",defaultValue = "100") Integer filterLimit,
            @RequestParam("method") String method,
            @RequestParam(value = "module",defaultValue = "API") String module,
            @RequestParam(value = "format",defaultValue = "json") String format
    ){
        if (!Objects.equals(url, "")){
            configClient.setMatomoUrl(url);
        }
        if(!Objects.equals(token_auth,"")){
            configClient.setMatomoToken(token_auth);
        }

        MatomoRequestParam params = MatomoRequestParam.builder()
                .method(method)
                .period(period)
                .idSite(idSite)
                .format(format)
                .date(date)
                .segment(segment)
                .filterLimit(filterLimit)
                .module(module)
                .build();

        MatomoClient builder = new MatomoClient.Builder()
                .matomoRequestParam(params)
                .configClient(configClient)
                .builder();

        Map<String, String> messages = new ConcurrentHashMap<>();
        try {
            String str = matomoGptService.analyzeData(builder, configClient);
            messages.put("message",str);
            messages.put("code","245");
            return messages;

        } catch (Exception e) {
            e.printStackTrace();
            messages.put("message","Server handling exception.");
            messages.put("code","456");
            return messages ;
        }

    }
    @ApiOperation(value = "One-API设置接口",notes = "设置One-API的api和Key")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "api",value = "接口地址，默认：https://api.openai.com/"),
            @ApiImplicitParam(name = "keys",value = "Key信息，支持多个Key，传入数组即可")
    })
    @PostMapping("/oneapi")
    public Object oneApiSettings(
            @RequestParam(value = "api") String api,
            @RequestParam(value = "keys") List<String> keys
    ){
        configClient.setOneApiApi(api);
        configClient.setOneApiKey(keys);
        Map<String, String> messages = new ConcurrentHashMap<>();
        messages.put("message","success");
        messages.put("code","245");
        return messages;
    }
}
