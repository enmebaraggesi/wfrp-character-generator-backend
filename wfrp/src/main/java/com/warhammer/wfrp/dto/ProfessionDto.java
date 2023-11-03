package com.warhammer.wfrp.dto;

import java.util.Map;

public record ProfessionDto(String classField,
                            String name,
                            String description,
                            String status,
                            Map<String, Integer> rolls) {
    
}
