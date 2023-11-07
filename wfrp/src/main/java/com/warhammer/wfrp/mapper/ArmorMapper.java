package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.armor.ArmorDto;
import com.warhammer.wfrp.model.armor.Armor;
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
