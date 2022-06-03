package com.restApi.config;

import com.restApi.Testowa;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfiguration {

    @Bean(name = "piotr")
    public Testowa getTestowa() {
        return new Testowa("Piotr", 12);
    }

    @Bean(name = "michal")
    public Testowa getTestowa2() {
        return new Testowa("Micha", 15);
    }


}
