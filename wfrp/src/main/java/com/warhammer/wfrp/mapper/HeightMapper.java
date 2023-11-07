package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.appearance.HeightDto;
import org.springframework.stereotype.Service;

@Service
public class HeightMapper {
    
    public HeightDto mapHeightToHeightDto(Integer height) {
        return new HeightDto(height.toString());
    }
}
