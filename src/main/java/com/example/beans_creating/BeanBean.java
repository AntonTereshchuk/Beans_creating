package com.example.beans_creating;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanBean {

    @Bean
    public String beanReturn() {
        return "bean result";
    }

    @PostConstruct
    void setUp() {
        System.out.println("Bean @Bean is started");
    }

}
