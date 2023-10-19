package com.ning.matomochatgpt.aiclient;

import com.ning.matomochatgpt.config.ConfigClient;
import com.ning.matomochatgpt.entity.AiClient;
import com.unfbx.chatgpt.OpenAiClient;
import com.unfbx.chatgpt.entity.chat.ChatCompletionResponse;
import com.unfbx.chatgpt.entity.chat.Message;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: AiClientTest <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/18 0018
 * @since JDK 11
 */
@SpringBootTest
public class AiClientTest {

    @Autowired
    private AiClient aiClient;
    @Autowired
    private ConfigClient configClient;
    @Test
    public void aiClientTest(){
        OpenAiClient openAiClient = aiClient.getOpenAiClient();
        List<Message> messages = new ArrayList<>();
        Message build = Message.builder().role(Message.Role.USER).content("Hi!").build();
        messages.add(build);
        ChatCompletionResponse chatCompletionResponse = openAiClient.chatCompletion(messages);
        String content = chatCompletionResponse.getChoices().get(0).getMessage().getContent();
        System.out.println(content);
    }
}
