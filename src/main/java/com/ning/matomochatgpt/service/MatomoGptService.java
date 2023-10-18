package com.ning.matomochatgpt.service;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.ning.matomochatgpt.config.ConfigClient;
import com.ning.matomochatgpt.entity.AiClient;
import com.ning.matomochatgpt.entity.MatomoResponse;
import com.ning.matomochatgpt.http.client.MatomoClient;
import com.unfbx.chatgpt.OpenAiClient;
import com.unfbx.chatgpt.entity.chat.ChatCompletion;
import com.unfbx.chatgpt.entity.chat.ChatCompletionResponse;
import com.unfbx.chatgpt.entity.chat.Message;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: MatomoGptService <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/18 0018
 * @since JDK 11
 */
@Service
@Slf4j
public class MatomoGptService {

    private final AiClient aiClient;
    public MatomoGptService( AiClient aiClient) {
        this.aiClient = aiClient;
    }

    public String analyzeData(MatomoClient matomoClient,ConfigClient configClient) throws JsonProcessingException {
        MatomoResponse api = matomoClient.getMatomoApi().api();
        String s = JSON.toJSONString(api);
        List<Message> messages = new ArrayList<Message>();
        Message systemMessage = Message.builder().content(configClient.getChatSystemPrompt()).role(Message.Role.SYSTEM).build();
        Message dataMessage = Message.builder().content(s).role(Message.Role.SYSTEM).build();
        messages.add(systemMessage);
        messages.add(dataMessage);
        OpenAiClient openAiClient = aiClient.getOpenAiClient();
        ChatCompletionResponse chatCompletionResponse = openAiClient.chatCompletion(ChatCompletion.builder().model(configClient.getChatModel()).messages(messages).build());
        return chatCompletionResponse.getChoices().get(0).getMessage().getContent();
    }
}
