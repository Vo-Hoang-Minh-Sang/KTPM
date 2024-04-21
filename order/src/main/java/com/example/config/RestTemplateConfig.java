package com.example.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }


//    @Bean
//    public RetryTemplate retryTemplate() {
//        RetryTemplate retryTemplate = new RetryTemplate();
//
//        // Cấu hình số lần retry và backoff policy
//        SimpleRetryPolicy retryPolicy = new SimpleRetryPolicy();
//        retryPolicy.setMaxAttempts(5); // Số lần retry tối đa
//        retryTemplate.setRetryPolicy(retryPolicy);
//
//        FixedBackOffPolicy backOffPolicy = new FixedBackOffPolicy();
//        backOffPolicy.setBackOffPeriod(5000); // Thời gian chờ giữa các lần retry (milliseconds)
//        retryTemplate.setBackOffPolicy(backOffPolicy);
//
//        return retryTemplate;
//    }



    public <T> T getForObject(String url, Class<T> responseType) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, responseType);
    }

}
