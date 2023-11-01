package com.warhammer.wfrp.controller;

import com.warhammer.wfrp.dto.AgeDto;
import com.warhammer.wfrp.engine.AgeGenerator;
import com.warhammer.wfrp.mapper.AgeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class AgeController {
    
    private final AgeMapper mapper;
    private final AgeGenerator generator;
    
    @GetMapping("/age/{race}")
    public AgeDto getGeneratedAge(@PathVariable String race) {
        Integer age = generator.generateAge(race);
        return mapper.mapAgeToAgeDto(age);
    }
}
