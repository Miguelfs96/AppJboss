package com.miguel.springmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.miguel.springmodule",exclude = {HibernateJpaAutoConfiguration.class, ServletWebServerFactoryAutoConfiguration.class})

public class SpringmoduleApplication extends ServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringmoduleApplication.class, args);
    }

}
