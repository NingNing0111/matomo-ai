package com.ning.matomochatgpt.http;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ning.matomochatgpt.config.ConfigClient;
import com.ning.matomochatgpt.entity.MatomoRequestParam;
import com.ning.matomochatgpt.entity.MatomoResponse;
import com.ning.matomochatgpt.http.api.ApiMethod;
import com.ning.matomochatgpt.http.api.MatomoApi;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

/**
 * ClassName: MatomoApiTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/18 0018
 * @since JDK 11
 */
@SpringBootTest
public class MatomoApiTest {
    @Autowired
    private ConfigClient configClient;

    private MatomoRequestParam matomoRequestParam;

    @Test
    public void apiMethodTest() throws JsonProcessingException {
        matomoRequestParam = MatomoRequestParam.builder()
                .idSite("4")
                .period("month")
                .date("2023-09-20")
                .module("API")
                .method("API.get")
                .format("json")
                .build();
        MatomoApi apiMethod = new ApiMethod(configClient, matomoRequestParam);
        MatomoResponse apiResponse = apiMethod.api();
        System.out.println(apiResponse);
    }
}
