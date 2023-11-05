package com.warhammer.wfrp.controllers;

import com.warhammer.wfrp.dto.HeightDto;
import com.warhammer.wfrp.engine.HeightGenerator;
import com.warhammer.wfrp.mapper.HeightMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class HeightControler {
    
    private final HeightMapper mapper;
    private final HeightGenerator generator;
    
    @GetMapping("/height/{race}")
    public HeightDto getHeightByRace(@PathVariable String race) {
        Integer height = generator.generateHeight(race);
        return mapper.mapHeightToHeightDto(height);
    }
}
