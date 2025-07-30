package com.example.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/myapp/hello")
    public String getAllTopics(){
        return "Hello! This is app ";
    }
}

