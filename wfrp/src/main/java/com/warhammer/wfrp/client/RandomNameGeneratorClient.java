package com.warhammer.wfrp.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomNameGeneratorClient {
    
    @Value("${name.generator.api.url}")
    private String url;
    
    
}
