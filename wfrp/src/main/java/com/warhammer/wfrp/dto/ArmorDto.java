package com.warhammer.wfrp.dto;

public record ArmorDto(String type,
                       String name,
                       String cost,
                       String weight,
                       String availability,
                       String penalty,
                       String localization,
                       Integer damage,
                       String traits) {
    
}
