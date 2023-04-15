package com.example.beans_creating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeansCreatingApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(BeansCreatingApplication.class, args);
        var beanController = context.getBean(TestControllerBean.class);
        var beanComponent = context.getBean(ComponentBean.class);
        var beanBean = context.getBean(String.class);
        var beanRepository = context.getBean(RepositoryBean.class);
        var beanService = context.getBean(ServiceBean.class);

   }

}
