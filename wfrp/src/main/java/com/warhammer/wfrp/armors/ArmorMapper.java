package com.warhammer.wfrp.armors;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmorMapper {
    
    public ArmorDto mapArmorToArmorDto(Armor armor) {
        return new ArmorDto(armor.getType(),
                            armor.getName(),
                            armor.getWeight(),
                            armor.getPenalty(),
                            armor.getLocalization(),
                            armor.getPoints(),
                            armor.getTraits());
    }
    
    public List<ArmorDto> mapArmorListToArmorDtoList(List<Armor> list) {
        return list.stream()
                   .map(this::mapArmorToArmorDto)
                   .toList();
    }
}
