package com.example.beans_creating;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestControllerBean {

    @GetMapping("/getHtml")
    public String getHtml() {
        return "index.html";
    }

    @PostConstruct
    void setUp() {
        System.out.println("Bean @Controller is started");
    }

}
