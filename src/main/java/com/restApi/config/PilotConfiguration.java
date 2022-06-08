
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
    public CommandLineRunner commandLineRunner(PilotRepository repository) {
        return args -> {
 /*           PilotObject pilot = new PilotObject("Sony5");
            PilotObject pilot2 = new PilotObject("Sony6");
            PilotObject pilot3 = new PilotObject("Sony7");
            PilotObject pilot4 = new PilotObject("Sony8");
            repository.saveAll(List.of(pilot,pilot2,pilot3,pilot4));*/

        };




    }


}

