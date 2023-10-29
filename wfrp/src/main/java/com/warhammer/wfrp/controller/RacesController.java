package com.warhammer.wfrp.controller;

import com.warhammer.wfrp.dto.RaceDto;
import com.warhammer.wfrp.mapper.RacesMapper;
import com.warhammer.wfrp.model.races.RacesRoll;
import com.warhammer.wfrp.repository.races.RacesRollRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RequiredArgsConstructor
@RestController
public class RacesController {
    
    private final RacesRollRepository repository;
    private final RacesMapper mapper;
    
    @GetMapping("/races")
    public List<RaceDto> getAllRaces() {
        List<RacesRoll> racesRollList = repository.findAll();
        return mapper.mapRacesRollListToRaceDtoList(racesRollList);
    }
    
    @GetMapping("/races/random")
    public RaceDto getRaceByChance() {
        int result = new Random().nextInt(1, 101);
        List<RacesRoll> list = repository.findAll();
        for (RacesRoll roll :
                list) {
            if (roll.getChanceMin() <= result && result <= roll.getChanceMax()) {
                return mapper.mapRacesRollToRaceDto(roll);
            }
        }
        return null;
    }
    
}
