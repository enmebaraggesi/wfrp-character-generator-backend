package com.warhammer.wfrp.service;

import com.warhammer.wfrp.dto.appearance.HeightDto;
import com.warhammer.wfrp.engine.HeightGenerator;
import com.warhammer.wfrp.mapper.HeightMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HeightService {
    
    private final HeightMapper mapper;
    private final HeightGenerator generator;
    
    public HeightDto getHeightByRace(String race) {
        Integer height = generator.generateHeight(race);
        return mapper.mapHeightToHeightDto(height);
    }
}
