package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class PrometheusK8sSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrometheusK8sSpringApplication.class, args);
    }


    @GetMapping
    public String sayHello(){
        return "HELLO WORLD "+System.currentTimeMillis();
    }
}
