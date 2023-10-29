package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.RaceDto;
import com.warhammer.wfrp.model.races.RacesRoll;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RacesMapper {
    
    public RaceDto mapRacesRollToRaceDto(RacesRoll racesRoll) {
        return new RaceDto(racesRoll.getName());
    }
    
    public List<RaceDto> mapRacesRollListToRaceDtoList(List<RacesRoll> list) {
        return list.stream()
                   .map(this::mapRacesRollToRaceDto)
                   .toList();
    }
}
