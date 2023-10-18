package com.ning.matomochatgpt.http;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ning.matomochatgpt.config.ConfigClient;
import com.ning.matomochatgpt.entity.MatomoRequestParam;
import com.ning.matomochatgpt.entity.MatomoResponse;
import com.ning.matomochatgpt.http.api.MatomoApi;
import com.ning.matomochatgpt.http.client.MatomoClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: MatomoClientTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/18 0018
 * @since JDK 11
 */
@SpringBootTest
public class MatomoClientTest {

    @Autowired
    private ConfigClient configClient;

    @Test
    public void clientTest() throws JsonProcessingException {
        configClient.setMatomoUrl("https://matomo.mnzdna.xyz/");
        configClient.setMatomoToken("4418e0de9******4b03565025");

        MatomoRequestParam matomoRequestParam = MatomoRequestParam.builder()
                .method("VisitsSummary.get")
                .module("API")
                .format("json")
                .date("2023-09-20")
                .period("month")
                .idSite("4")
                .build();

        MatomoClient client = new MatomoClient.Builder()
                .configClient(configClient)
                .matomoRequestParam(matomoRequestParam)
                .builder();

        MatomoApi matomoApi = client.getMatomoApi();

        MatomoResponse apiResponse = matomoApi.api();

        System.out.println(apiResponse);

    }
}
