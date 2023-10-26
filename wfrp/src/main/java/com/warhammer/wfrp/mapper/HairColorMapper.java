package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.HairColorDto;
import com.warhammer.wfrp.model.hair.HairColor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HairColorMapper {
    
    public List<HairColorDto> mapHairColorListToHairColorListDto(List<HairColor> colors) {
        return colors.stream()
                     .map(this::mapHairColorToHairColorDto)
                     .toList();
    }
    
    public HairColorDto mapHairColorToHairColorDto(HairColor color) {
        return new HairColorDto(color.getColor());
    }
}