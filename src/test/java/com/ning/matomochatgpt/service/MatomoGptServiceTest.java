package com.ning.matomochatgpt.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ning.matomochatgpt.config.ConfigClient;
import com.ning.matomochatgpt.entity.MatomoRequestParam;
import com.ning.matomochatgpt.http.client.MatomoClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

/**
 * ClassName: MatomoGptServiceTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/18 0018
 * @since JDK 11
 */
@SpringBootTest
public class MatomoGptServiceTest {
    @Autowired
    private ConfigClient configClient;

    @Autowired
    private MatomoGptService matomoGptService;

    @Test
    public void analyzeData() throws JsonProcessingException {
        MatomoRequestParam matomoRequestParam = MatomoRequestParam.builder()
                .method("Actions.get")
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
        String s = matomoGptService.analyzeData(client, configClient);
        System.out.println(s);

    }
}
