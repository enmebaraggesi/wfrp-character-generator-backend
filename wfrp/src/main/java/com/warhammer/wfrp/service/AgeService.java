package com.warhammer.wfrp.service;

import com.warhammer.wfrp.dto.appearance.AgeDto;
import com.warhammer.wfrp.engine.AgeGenerator;
import com.warhammer.wfrp.mapper.AgeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AgeService {
    
    private final AgeGenerator generator;
    private final AgeMapper mapper;
    
    public AgeDto getGeneratedAgeByRace(String race) {
        Integer age = generator.generateAge(race);
        return mapper.mapAgeToAgeDto(age);
    }
}
