package com.warhammer.wfrp.controller;

import com.warhammer.wfrp.dto.appearance.RaceDto;
import com.warhammer.wfrp.dto.profession.ProfessionDto;
import com.warhammer.wfrp.service.ProfessionService;
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
