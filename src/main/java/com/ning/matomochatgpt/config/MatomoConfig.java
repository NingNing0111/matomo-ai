package com.ning.matomochatgpt.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: MatomoConfig <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/17 0017
 * @since JDK 11
 */
@Configuration
@ConfigurationProperties(prefix = "matomo")
@Data
public class MatomoConfig {
    private String url;
    private String token;
}
