package com.warhammer.wfrp.age;

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
