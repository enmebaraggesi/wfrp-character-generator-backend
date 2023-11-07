package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.appearance.HairColorDto;
import com.warhammer.wfrp.model.hair.HairColorsInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class HairColorMapper {
    
    public HairColorDto mapHairColorToHairColorDto(HairColorsInterface color) {
        return new HairColorDto(color.getColorId().getColor());
    }
    
    public Set<HairColorDto> mapHairColorListToHairColorDtoSet(List<HairColorsInterface> list) {
        return list.stream()
                   .map(this::mapHairColorToHairColorDto)
                   .collect(Collectors.toSet());
    }
}
