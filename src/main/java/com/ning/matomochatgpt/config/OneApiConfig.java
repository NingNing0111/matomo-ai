package com.ning.matomochatgpt.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * ClassName: OneApiConfig <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
@Configuration
@ConfigurationProperties(prefix = "oneapi")
@Data
public class OneApiConfig {
    private String api;
    private List<String> key;
}
