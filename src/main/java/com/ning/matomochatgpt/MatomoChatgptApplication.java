package com.ning.matomochatgpt;

import com.unfbx.chatgpt.interceptor.OpenAILogger;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@EnableWebMvc
public class MatomoChatgptApplication {

    public static void main(String[] args) {
        SpringApplication.run(MatomoChatgptApplication.class, args);
    }

    @Bean
    public OkHttpClient okHttpClient(){
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new OpenAILogger());
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);
        return new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .connectTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(600,TimeUnit.SECONDS)
                .readTimeout(600,TimeUnit.SECONDS)
                .build();
    }

}
