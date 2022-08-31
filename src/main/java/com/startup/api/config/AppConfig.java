package com.startup.api.config;

import com.startup.api.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import com.fasterxml.jackson.databind.ObjectMapper;

@Profile({"local", "dev", "prod"})
@Configuration
public class AppConfig {

    @Bean
    @Primary
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = ObjectUtils.getObjectMapper();
        return objectMapper;
    }
}
