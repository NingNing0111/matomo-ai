package com.ning.matomochatgpt.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * ClassName: ConfigTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
@SpringBootTest
public class ConfigTest {

    @Autowired
    private ConfigClient configClient;
    @Test
    public void configClientGetTest(){
        String chatModel = configClient.getChatModel();
        String chatSystemPrompt = configClient.getChatSystemPrompt();
        String matomoToken = configClient.getMatomoToken();
        String matomoUrl = configClient.getMatomoUrl();
        String oneApiApi = configClient.getOneApiApi();
        List<String> oneApiKey = configClient.getOneApiKey();
        ChatConfig chatConfig = configClient.getChatConfig();
        MatomoConfig matomoConfig = configClient.getMatomoConfig();
        OneApiConfig oneApiConfig = configClient.getOneApiConfig();
        System.out.println(chatModel);
        System.out.println(chatSystemPrompt);
        System.out.println(matomoUrl);
        System.out.println(matomoToken);
        System.out.println(oneApiApi);
        System.out.println(oneApiKey);
        System.out.println(chatConfig);
        System.out.println(matomoConfig);
        System.out.println(oneApiConfig);
    }

    @Test
    public void configClientSetTest(){
        configClient.setChatModel("gpt-4.0");
        configClient.setChatSystemPrompt("Hello！");
        ChatConfig chatConfig = configClient.getChatConfig();
        System.out.println(chatConfig);


    }
}
