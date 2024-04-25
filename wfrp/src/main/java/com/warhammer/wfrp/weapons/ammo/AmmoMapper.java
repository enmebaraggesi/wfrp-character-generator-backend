package com.warhammer.wfrp.weapons.ammo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmmoMapper {
    
    public AmmoDto mapAmmoToAmmoDto(Ammo ammo) {
        return new AmmoDto(ammo.getType(),
                           ammo.getName(),
                           ammo.getLength(),
                           ammo.getDamage(),
                           ammo.getTraits());
    }
    
    public List<AmmoDto> mapAmmoListToAmmoDtoList(List<Ammo> list) {
        return list.stream()
                   .map(this::mapAmmoToAmmoDto)
                   .toList();
    }
}
