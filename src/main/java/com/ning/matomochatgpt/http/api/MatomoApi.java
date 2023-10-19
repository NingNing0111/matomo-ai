package com.ning.matomochatgpt.http.api;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.TypeReference;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.ning.matomochatgpt.config.ConfigClient;
import com.ning.matomochatgpt.config.MatomoConfig;
import com.ning.matomochatgpt.entity.MatomoRequestParam;
import com.ning.matomochatgpt.entity.MatomoResponse;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.dreamlu.mica.http.HttpRequest;

import java.time.Duration;
import java.util.Map;

/**
 * ClassName: MatomoApi <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
@Slf4j
public abstract class MatomoApi {
    @Setter
    private ConfigClient configClient;
    @Setter
    private MatomoRequestParam matomoRequestParam;
    public MatomoApi(ConfigClient configClient,MatomoRequestParam matomoRequestParam){
        this.configClient = configClient;
        this.matomoRequestParam = matomoRequestParam;
    }

    public ConfigClient getConfigClient() {
        return configClient;
    }

    public MatomoRequestParam getMatomoRequestParam(){
        return matomoRequestParam;
    }

    public abstract MatomoResponse api() throws JsonProcessingException;
    protected String post(ConfigClient configClient,MatomoRequestParam matomoRequestParam) throws JsonProcessingException{
        matomoRequestParam.setMethod(matomoRequestParam.getMethod() + ".get");
        Map<String,Object> params = JSON.parseObject(JSON.toJSONString(matomoRequestParam), new TypeReference<>() {});
        log.info("请求地址:{}",configClient.getMatomoUrl());
        log.info("请求参数:{}",params);
        log.info("配置：{}",configClient.getMatomoConfig());
        String result = HttpRequest.post(configClient.getMatomoUrl())
                .setHeader("Content-type", "application/json")
                .connectTimeout(Duration.ofSeconds(6))
                .readTimeout(Duration.ofSeconds(6))
                .writeTimeout(Duration.ofSeconds(6))
                .queryMap(params)
                .query("token_auth",configClient.getMatomoToken())
                .execute()
                .asString();
        log.info("http request result:{}",result);
        return result;
    }
}
