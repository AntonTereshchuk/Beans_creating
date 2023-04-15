package com.example.beans_creating;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
@Data
public class RepositoryBean {

    private HashMap<Integer, String> hm = new HashMap<>();

    {
        for(int i = 0; i < 5; i++) {
            hm.put(i, "Text " + i);
        }
    }

    @PostConstruct
    void setUp() {
        System.out.println("Bean @Repository is started");
    }

}
