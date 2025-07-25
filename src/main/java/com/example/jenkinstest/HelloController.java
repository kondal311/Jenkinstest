package com.example.jenkinstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello " + name + " updated with Spring Boot!";
    }
    
    @GetMapping("/")
    public String home() {
        return "Welcome to Jenkins Test Spring Boot Application! Visit /hello for the greeting.";
    }
}