package com.warhammer.wfrp.weapons;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeaponMapper {
    
    public WeaponDto mapWeaponToWeaponDto(Weapon weapon) {
        return new WeaponDto(weapon.getType(),
                             weapon.getName(),
                             weapon.getWeight(),
                             weapon.getLength(),
                             weapon.getDamage(),
                             weapon.getTraits());
    }
    
    public List<WeaponDto> mapWeaponListToWeaponDtoList(List<Weapon> list) {
        return list.stream()
                   .map(this::mapWeaponToWeaponDto)
                   .toList();
    }
}
