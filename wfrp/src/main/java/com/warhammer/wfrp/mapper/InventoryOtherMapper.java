package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.InventoryDto;
import com.warhammer.wfrp.model.inventory.InventoryOther;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryOtherMapper {
    
    private InventoryDto mapInventoryOtherToInventoryDto(InventoryOther inventoryOther) {
        return new InventoryDto(inventoryOther.getType(),
                                inventoryOther.getName(),
                                inventoryOther.getCost(),
                                inventoryOther.getWeight(),
                                inventoryOther.getContains(),
                                inventoryOther.getAvailability());
    }
    
    public List<InventoryDto> mapInventoryOtherListToInventoryDtoList(List<InventoryOther> list) {
        return list.stream()
                   .map(this::mapInventoryOtherToInventoryDto)
                   .toList();
    }
}
