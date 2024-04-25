package com.warhammer.wfrp.professions;

import com.warhammer.wfrp.races.RaceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("professions")
public class ProfessionsController {
    
    private final ProfessionService service;
    
    @GetMapping
    public List<ProfessionDto> getAllProfessions() {
        return service.getAllProfessionsList();
    }
    
    @GetMapping("random")
    public ProfessionDto getRandomProfessionByRace(@RequestBody RaceDto raceDto) {
        return service.getRandomProfessionByRace(raceDto);
    }
}
