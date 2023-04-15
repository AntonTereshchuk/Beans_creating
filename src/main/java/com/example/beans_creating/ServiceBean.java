package com.example.beans_creating;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ServiceBean {

    private String testService;

    @PostConstruct
    void setUp() {
        System.out.println("Bean @Service is started");
    }


}
