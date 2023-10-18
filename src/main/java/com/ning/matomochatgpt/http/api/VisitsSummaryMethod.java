package com.ning.matomochatgpt.http.api;

import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.ning.matomochatgpt.config.ConfigClient;
import com.ning.matomochatgpt.entity.MatomoRequestParam;
import com.ning.matomochatgpt.entity.MatomoResponse;
import com.ning.matomochatgpt.entity.res.VisitsSummaryResponse;
import lombok.extern.slf4j.Slf4j;


public class VisitsSummaryMethod extends MatomoApi {
    public VisitsSummaryMethod(ConfigClient configClient, MatomoRequestParam matomoRequestParam) {
        super(configClient, matomoRequestParam);
    }

    @Override
    public MatomoResponse api() throws JsonProcessingException {
        String post = post(getConfigClient(), getMatomoRequestParam());
        return JSON.parseObject(post, VisitsSummaryResponse.class);
    }
}
