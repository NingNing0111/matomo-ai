package com.ning.matomochatgpt.http.api;

import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.ning.matomochatgpt.config.ConfigClient;
import com.ning.matomochatgpt.entity.MatomoRequestParam;
import com.ning.matomochatgpt.entity.MatomoResponse;
import com.ning.matomochatgpt.entity.res.ActionsResponse;

/**
 * ClassName: ActionsMethod <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/18 0018
 * @since JDK 11
 */
public class ActionsMethod extends MatomoApi{
    public ActionsMethod(ConfigClient configClient, MatomoRequestParam matomoRequestParam) {
        super(configClient, matomoRequestParam);
    }

    @Override
    public MatomoResponse api() throws JsonProcessingException {
        String post = post(getConfigClient(), getMatomoRequestParam());
        return JSON.parseObject(post, ActionsResponse.class);
    }
}
