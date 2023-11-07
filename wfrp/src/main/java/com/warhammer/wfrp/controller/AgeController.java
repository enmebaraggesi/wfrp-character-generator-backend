package com.warhammer.wfrp.controller;

import com.warhammer.wfrp.dto.appearance.AgeDto;
import com.warhammer.wfrp.service.AgeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("age")
public class AgeController {
    
    private final AgeService service;
    
    @GetMapping("{race}")
    public AgeDto getAgeByRace(@PathVariable String race) {
        return service.getGeneratedAgeByRace(race);
    }
}
