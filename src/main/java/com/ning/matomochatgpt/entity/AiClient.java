package com.ning.matomochatgpt.entity;

import com.ning.matomochatgpt.config.ConfigClient;
import com.unfbx.chatgpt.OpenAiClient;
import com.unfbx.chatgpt.function.KeyRandomStrategy;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * ClassName: AiClient <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/18 0018
 * @since JDK 11
 */
@Repository
public class AiClient {
    private final OkHttpClient okHttpClient;

    private final ConfigClient configClient;
    public AiClient(OkHttpClient okHttpClient, ConfigClient configClient) {
        this.okHttpClient = okHttpClient;
        this.configClient = configClient;
    }

    public OpenAiClient getOpenAiClient(){
        return getOpenAiClient(configClient);
    }

    public OpenAiClient getOpenAiClient(ConfigClient configClient){
        return OpenAiClient.builder()
                .okHttpClient(okHttpClient)
                .apiHost(configClient.getOneApiApi())
                .apiKey(configClient.getOneApiKey())
                .keyStrategy(new KeyRandomStrategy())
                .build();
    }
}
