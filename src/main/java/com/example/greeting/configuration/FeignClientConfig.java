package com.example.greeting.configuration;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfig {

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor(SecurityConfigurationProperties securityConfigurationProperties) {
        return new BasicAuthRequestInterceptor(securityConfigurationProperties.getName(), securityConfigurationProperties.getPassword());
    }

}
