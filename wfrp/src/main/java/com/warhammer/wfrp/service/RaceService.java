package com.warhammer.wfrp.service;

import com.warhammer.wfrp.dto.appearance.RaceDto;
import com.warhammer.wfrp.engine.DiceRoller;
import com.warhammer.wfrp.mapper.RaceMapper;
import com.warhammer.wfrp.model.race.Race;
import com.warhammer.wfrp.repository.race.RaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RaceService {
    
    private final RaceRepository repository;
    private final RaceMapper mapper;
    private final DiceRoller roller;
    
    public List<RaceDto> getAllRacesList() {
        List<Race> races = repository.findAll();
        return mapper.mapRacelListToRaceDtoList(races);
    }
    
    //TODO obsługa błędów
    public RaceDto getRandomRace() {
        int result = roller.rollK100();
        List<Race> races = repository.findAll();
        for (Race race : races) {
            if (isAvailableForResult(race, result)) {
                return mapper.mapRaceToRaceDto(race);
            }
        }
        return null;
    }
    
    private static boolean isAvailableForResult(Race roll, int result) {
        return roll.getChanceMin() <= result && result <= roll.getChanceMax();
    }
}
