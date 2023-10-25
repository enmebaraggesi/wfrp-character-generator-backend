package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.EyeColorDto;
import com.warhammer.wfrp.model.EyeColor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EyeColorMapper {
    
    public List<EyeColorDto> mapEyeColorListToEyeColorDtoList(List<EyeColor> colors) {
        return colors.stream()
                     .map(EyeColor::getColor)
                     .map(EyeColorDto::new)
                     .toList();
    }
    
    public EyeColorDto mapEyeColorToEyeColorDto(EyeColor color) {
        return new EyeColorDto(color.getColor());
    }
}
