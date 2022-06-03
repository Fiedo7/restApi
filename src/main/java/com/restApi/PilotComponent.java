package com.restApi;

import com.restApi.service.PilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PilotComponent {

    @Autowired
    private PilotService pilotService;

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println(pilotService.returnName());
            System.out.println("KJazda");
        };
    }


}
