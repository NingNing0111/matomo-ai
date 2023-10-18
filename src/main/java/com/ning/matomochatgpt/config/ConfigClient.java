package com.ning.matomochatgpt.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: ConfigClient <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
@Repository
@Data
public class ConfigClient {
    private final ChatConfig chatConfig;
    private final MatomoConfig matomoConfig;
    private final OneApiConfig oneApiConfig;

    public ConfigClient(ChatConfig chatConfig, MatomoConfig matomoConfig, OneApiConfig oneApiConfig) {
        this.chatConfig = chatConfig;
        this.matomoConfig = matomoConfig;
        this.oneApiConfig = oneApiConfig;
    }

    public String getChatSystemPrompt(){
        return chatConfig.getSystemPrompt();
    }

    public String getChatModel(){
        return chatConfig.getModel();
    }

    public void setChatSystemPrompt(String systemPrompt){
        chatConfig.setSystemPrompt(systemPrompt);
    }

    public void setChatModel(String model){
        chatConfig.setModel(model);
    }

    public String getMatomoUrl(){
        return matomoConfig.getUrl();
    }
    public String getMatomoToken(){
        return matomoConfig.getToken();
    }

    public void setMatomoUrl(String url){
        matomoConfig.setUrl(url);
    }

    public void setMatomoToken(String token){
        matomoConfig.setToken(token);
    }

    public String getOneApiApi(){
        return oneApiConfig.getApi();
    }
    public List<String> getOneApiKey(){
        return oneApiConfig.getKey();
    }
    public void setOneApiApi(String api){
        oneApiConfig.setApi(api);
    }
    public void setOneApiKey(List<String> key){
        oneApiConfig.setKey(key);
    }

    public ChatConfig getChatConfig(){
        return chatConfig;
    }
    public MatomoConfig getMatomoConfig(){
        return matomoConfig;
    }
    public OneApiConfig getOneApiConfig(){
        return oneApiConfig;
    }
}
