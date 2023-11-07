package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.appearance.RaceDto;
import com.warhammer.wfrp.model.race.Race;
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
