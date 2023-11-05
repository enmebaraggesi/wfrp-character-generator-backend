package com.warhammer.wfrp.dto;

public record ArmorDto(String type,
                       String name,
                       String weight,
                       String penalty,
                       String localization,
                       Integer points,
                       String traits) {
    
}
