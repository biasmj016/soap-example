package com.soap.example.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.ws.test.server.MockWebServiceClient;

@TestConfiguration
public class TestConfig {

    @Bean
    public MockWebServiceClient mockWebServiceClient(ApplicationContext applicationContext) {
        return MockWebServiceClient.createClient(applicationContext);
    }
}