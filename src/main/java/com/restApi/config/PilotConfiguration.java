package com.restApi.config;


import com.restApi.PilotObject;
import com.restApi.repository.PilotRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PilotConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(PilotRepository repository) {
        return args -> {
            PilotObject pilot = new PilotObject("Sony");


        };
    }


}