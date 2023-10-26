package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.EyeColorDto;
import com.warhammer.wfrp.model.eyes.EyeColor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class EyeColorMapper {
    
    public Set<EyeColorDto> mapEyeColorListToEyeColorDtoList(List<EyeColor> colors) {
        return colors.stream()
                     .map(this::mapEyeColorToEyeColorDto)
                     .collect(Collectors.toSet());
    }
    
    public EyeColorDto mapEyeColorToEyeColorDto(EyeColor color) {
        return new EyeColorDto(color.getColor());
    }
}
