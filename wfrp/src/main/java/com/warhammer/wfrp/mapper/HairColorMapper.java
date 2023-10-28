package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.HairColorDto;
import com.warhammer.wfrp.model.hair.HairColorsInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HairColorMapper {
    
    public HairColorDto mapHairColorToHairColorDto(HairColorsInterface color) {
        return new HairColorDto(color.getColorId().getColor());
    }
    
    public List<HairColorDto> mapHairColorListToHairColorListDto(List<HairColorsInterface> list) {
        return list.stream()
                   .map(this::mapHairColorToHairColorDto)
                   .toList();
    }
}
