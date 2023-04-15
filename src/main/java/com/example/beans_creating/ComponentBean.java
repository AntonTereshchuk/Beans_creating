package com.example.beans_creating;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ComponentBean {

    private int componentNumber;
    {componentNumber = 5;}

    @PostConstruct
    void setUp() {
        System.out.println("Bean @Component is started");
    }

}
