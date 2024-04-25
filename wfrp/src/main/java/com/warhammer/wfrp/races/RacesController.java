package com.warhammer.wfrp.races;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("races")
public class RacesController {
    
    private final RaceService service;
    
    @GetMapping
    public List<RaceDto> getAllRaces() {
        return service.getAllRacesList();
    }
    
    @GetMapping("random")
    public RaceDto getRandomRace() {
        return service.getRandomRace();
    }
    
}
