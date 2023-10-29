package com.warhammer.wfrp.dto;

public record InventoryDto(String type,
                           String name,
                           String cost,
                           String weight,
                           Integer contains,
                           String availability) {
    
}
