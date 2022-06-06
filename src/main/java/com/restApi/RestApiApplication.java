package com.restApi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication

public class RestApiApplication {


    public static void main(String[] args) {
        SpringApplication.run(RestApiApplication.class, args);


    }



}
