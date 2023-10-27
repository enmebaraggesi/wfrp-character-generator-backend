package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.ArmorDto;
import com.warhammer.wfrp.model.armors.InventoryArmor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmorMapper {
    
    public ArmorDto mapInventoryArmorToArmorDto(InventoryArmor inventoryArmor) {
        return new ArmorDto(inventoryArmor.getType(),
                            inventoryArmor.getName(),
                            inventoryArmor.getCost(),
                            inventoryArmor.getWeight(),
                            inventoryArmor.getAvailability(),
                            inventoryArmor.getPenalty(),
                            inventoryArmor.getLocalization(),
                            inventoryArmor.getDamage(),
                            inventoryArmor.getTraits());
    }
    
    public List<ArmorDto> mapInventoryArmorListToArmorDtoList(List<InventoryArmor> list) {
        return list.stream()
                   .map(this::mapInventoryArmorToArmorDto)
                   .toList();
    }
}
