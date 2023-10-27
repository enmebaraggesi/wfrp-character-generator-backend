package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.WeaponDto;
import com.warhammer.wfrp.model.weapons.InventoryWeapon;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeaponMapper {
    
    public WeaponDto mapInventoryWeaponToWeaponDto(InventoryWeapon inventoryWeapon) {
        return new WeaponDto(inventoryWeapon.getType(),
                             inventoryWeapon.getName(),
                             inventoryWeapon.getCost(),
                             inventoryWeapon.getWeight(),
                             inventoryWeapon.getAvailability(),
                             inventoryWeapon.getLength(),
                             inventoryWeapon.getDamage(),
                             inventoryWeapon.getTraits());
    }
    
    public List<WeaponDto> mapInventoryWeaponListToWeaponDtoList(List<InventoryWeapon> list) {
        return list.stream()
                   .map(this::mapInventoryWeaponToWeaponDto)
                   .toList();
    }
}
