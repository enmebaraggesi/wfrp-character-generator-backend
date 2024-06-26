package com.warhammer.wfrp.height;

import com.warhammer.wfrp.engine.HeightGenerator;
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
