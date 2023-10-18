package com.ning.matomochatgpt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * ClassName: Swagger2Config <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/18 0018
 * @since JDK 11
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(true)
                .groupName("v1")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ning.matomochatgpt.controller"))
                .build();
    }

    private ApiInfo apiInfo(){
        Contact contact = new Contact("NingNing0111", "https://pgthinker.me", "zdncode@gmail.com");
        return new ApiInfo(
                "Matomo AI 数据分析系统",
                "使用AI分析你的网站数据，并给出网站运营的方案",
                "v1.0",
                "https://github.com/ningning0111",
                contact,
                "Apache 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<>()
        );
    }
}
