package com.ning.matomochatgpt.http.api;

import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.ning.matomochatgpt.config.ConfigClient;
import com.ning.matomochatgpt.entity.MatomoRequestParam;
import com.ning.matomochatgpt.entity.MatomoResponse;
import com.ning.matomochatgpt.entity.res.PagePerformanceResponse;

/**
 * ClassName: PagePerformanceMethod <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/19 0019
 * @since JDK 11
 */
public class PagePerformanceMethod extends MatomoApi{
    public PagePerformanceMethod(ConfigClient configClient, MatomoRequestParam matomoRequestParam) {
        super(configClient, matomoRequestParam);
    }

    @Override
    public MatomoResponse api() throws JsonProcessingException {
        String jsonData = post(getConfigClient(), getMatomoRequestParam());
        return JSON.parseObject(jsonData, PagePerformanceResponse.class);
    }
}
