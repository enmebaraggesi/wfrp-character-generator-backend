package com.warhammer.wfrp.dto.inventory;

public record InventoryDto(String type,
                           String name,
                           String cost,
                           String weight,
                           Integer contains,
                           String availability) {
    
}
