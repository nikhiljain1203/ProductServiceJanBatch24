package com.example.productservicejanbatch24.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    @Bean
    //@LoadBalanced //client side load balancing
    public RestTemplate createRestTemplate() {
        return new RestTemplate();
    }
}
