package com.warhammer.wfrp.age;

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
