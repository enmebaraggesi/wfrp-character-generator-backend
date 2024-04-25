package com.warhammer.wfrp.races;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceMapper {
    
    public RaceDto mapRaceToRaceDto(Race race) {
        return new RaceDto(race.getName());
    }
    
    public List<RaceDto> mapRacelListToRaceDtoList(List<Race> list) {
        return list.stream()
                   .map(this::mapRaceToRaceDto)
                   .toList();
    }
    
    public String mapRaceDtoToRaceName(RaceDto raceDto) {
        return raceDto.race();
    }
}
