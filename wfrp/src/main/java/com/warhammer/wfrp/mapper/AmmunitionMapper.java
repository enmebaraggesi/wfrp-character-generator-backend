package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.weapon.AmmoDto;
import com.warhammer.wfrp.model.weapon.Ammo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmmunitionMapper {
    
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
