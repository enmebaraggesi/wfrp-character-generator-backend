package com.warhammer.wfrp.eyes;

import com.warhammer.wfrp.eyes.models.EyeColorInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class EyeColorMapper {
    
    public EyeColorDto mapEyeColorToEyeColorDto(EyeColorInterface color) {
        return new EyeColorDto(color.getColorId().getColor());
    }
    
    public Set<EyeColorDto> mapEyeColorListToEyeColorDtoSet(List<EyeColorInterface> list) {
        return list.stream()
                   .map(this::mapEyeColorToEyeColorDto)
                   .collect(Collectors.toSet());
    }
}
