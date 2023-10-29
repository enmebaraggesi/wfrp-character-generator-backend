package com.warhammer.wfrp;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition
@SpringBootApplication
public class WfrpApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(WfrpApplication.class, args);
    }
    
}
