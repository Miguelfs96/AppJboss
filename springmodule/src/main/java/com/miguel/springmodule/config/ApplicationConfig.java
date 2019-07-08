package com.miguel.springmodule.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public DbConnectionProps dbConnectionProps(){
        return new DbConnectionProps();
    }

}
