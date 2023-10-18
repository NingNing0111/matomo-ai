package com.ning.matomochatgpt.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: ChatConfig <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
@Configuration
@ConfigurationProperties(prefix = "chat")
@Data
public class ChatConfig {
    private String systemPrompt;
    private String model;
}
