package com.warhammer.wfrp.inventory;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryMapper {
    
    private InventoryDto mapInventoryToInventoryDto(Inventory inventory) {
        return new InventoryDto(inventory.getType(),
                                inventory.getName(),
                                inventory.getCost(),
                                inventory.getWeight(),
                                inventory.getContains(),
                                inventory.getAvailability());
    }
    
    public List<InventoryDto> mapInventoryListToInventoryDtoList(List<Inventory> list) {
        return list.stream()
                   .map(this::mapInventoryToInventoryDto)
                   .toList();
    }
}
