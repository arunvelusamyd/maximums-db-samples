package com.flexy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class PostgresSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostgresSampleApplication.class, args);
    }

}
