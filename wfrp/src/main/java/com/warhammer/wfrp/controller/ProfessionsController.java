package com.warhammer.wfrp.controller;

import com.warhammer.wfrp.dto.ProfessionDto;
import com.warhammer.wfrp.dto.RaceDto;
import com.warhammer.wfrp.mapper.ProfessionsMapper;
import com.warhammer.wfrp.model.professions.ProfessionsRoll;
import com.warhammer.wfrp.repository.professions.ProfessionsRollRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RequiredArgsConstructor
@RestController
public class ProfessionsController {
    
    private final ProfessionsRollRepository repository;
    private final ProfessionsMapper mapper;
    
    @GetMapping("/professions")
    public List<ProfessionDto> getAllProfessions() {
        List<ProfessionsRoll> professionsRolls = repository.findAll();
        return mapper.mapProfessionsRollsListToProfessionDtoList(professionsRolls);
    }
    
    @GetMapping("/professions/random")
    public ProfessionDto getProfessionByChance(@RequestBody RaceDto raceDto) {
        int result = new Random().nextInt(1, 101);
        List<ProfessionsRoll> rolls = repository.findAll();
        for (ProfessionsRoll prof : rolls) {
            switch (raceDto.race()) {
                case "Człowiek" -> {
                    if (prof.getHuMin() != null && prof.getHuMin() <= result && result <= prof.getHuMax()) {
                        return mapper.mapProfessionsRollToProfessionDto(prof);
                    }
                }
                case "Krasnolud" -> {
                    if (prof.getDwMin() != null && prof.getDwMin() <= result && result <= prof.getDwMax()) {
                        return mapper.mapProfessionsRollToProfessionDto(prof);
                    }
                }
                case "Niziołek" -> {
                    if (prof.getHalMin() != null && prof.getHalMin() <= result && result <= prof.getHalMax()) {
                        return mapper.mapProfessionsRollToProfessionDto(prof);
                    }
                }
                case "Wysoki elf" -> {
                    if (prof.getHElfMin() != null && prof.getHElfMin() <= result && result <= prof.getHElfMax()) {
                        return mapper.mapProfessionsRollToProfessionDto(prof);
                    }
                }
                case "Leśny elf" -> {
                    if (prof.getWElfMin() != null && prof.getWElfMin() <= result && result <= prof.getWElfMax()) {
                        return mapper.mapProfessionsRollToProfessionDto(prof);
                    }
                }
            }
        }
        return null;
    }
}
