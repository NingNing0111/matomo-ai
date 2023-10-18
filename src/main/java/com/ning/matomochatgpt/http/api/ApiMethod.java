package com.ning.matomochatgpt.http.api;

import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.ning.matomochatgpt.config.ConfigClient;
import com.ning.matomochatgpt.entity.MatomoRequestParam;
import com.ning.matomochatgpt.entity.MatomoResponse;
import com.ning.matomochatgpt.entity.res.ApiResponse;
import lombok.extern.slf4j.Slf4j;


public class ApiMethod extends MatomoApi{
    public ApiMethod(ConfigClient configClient, MatomoRequestParam matomoRequestParam) {
        super(configClient, matomoRequestParam);
    }

    @Override
    public MatomoResponse api() throws JsonProcessingException{
            String post = post(getConfigClient(), getMatomoRequestParam());
            return JSON.parseObject(post, ApiResponse.class);
    }
}
