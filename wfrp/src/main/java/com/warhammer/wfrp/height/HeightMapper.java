package com.warhammer.wfrp.height;

import org.springframework.stereotype.Service;

@Service
public class HeightMapper {
    
    public HeightDto mapHeightToHeightDto(Integer height) {
        return new HeightDto(height.toString());
    }
}
