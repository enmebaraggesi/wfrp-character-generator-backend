package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.AmmoDto;
import com.warhammer.wfrp.model.weapons.InventoryAmmo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmmunitionMapper {
    
    public AmmoDto mapInventoryAmmoToAmmoDto(InventoryAmmo inventoryAmmo) {
        return new AmmoDto(inventoryAmmo.getType(),
                           inventoryAmmo.getName(),
                           inventoryAmmo.getCost(),
                           inventoryAmmo.getAvailability(),
                           inventoryAmmo.getLength(),
                           inventoryAmmo.getDamage(),
                           inventoryAmmo.getTraits());
    }
    
    public List<AmmoDto> mapInventoryAmmoListToAmmoDtoList(List<InventoryAmmo> list) {
        return list.stream()
                   .map(this::mapInventoryAmmoToAmmoDto)
                   .toList();
    }
}
