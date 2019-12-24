package com.example.greeting.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.security.user")
@Data
public class SecurityConfigurationProperties {

    private String name;
    private String password;
}
