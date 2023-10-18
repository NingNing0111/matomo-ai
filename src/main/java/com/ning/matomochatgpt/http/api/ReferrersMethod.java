package com.ning.matomochatgpt.http.api;

import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.ning.matomochatgpt.config.ConfigClient;
import com.ning.matomochatgpt.entity.MatomoRequestParam;
import com.ning.matomochatgpt.entity.MatomoResponse;
import com.ning.matomochatgpt.entity.res.ReferrersResponse;

/**
 * ClassName: ReferrersMethod <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/18 0018
 * @since JDK 11
 */
public class ReferrersMethod extends MatomoApi{
    public ReferrersMethod(ConfigClient configClient, MatomoRequestParam matomoRequestParam) {
        super(configClient, matomoRequestParam);
    }
    @Override
    public MatomoResponse api() throws JsonProcessingException {
        String jsonData = post(getConfigClient(), getMatomoRequestParam());
        return JSON.parseObject(jsonData, ReferrersResponse.class);
    }
}
