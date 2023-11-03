package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.ProfessionDto;
import com.warhammer.wfrp.model.professions.ProfessionsRoll;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProfessionsMapper {
    
    public ProfessionDto mapProfessionsRollToProfessionDto(ProfessionsRoll professionsRoll) {
        Map<String, Integer> rolls = new HashMap<>(Map.of("Dwarf min", professionsRoll.getDwMin(),
                                                          "Dwarf max", professionsRoll.getDwMax(),
                                                          "Human min", professionsRoll.getHuMin(),
                                                          "Human max", professionsRoll.getHuMax(),
                                                          "Halfling min", professionsRoll.getHalMin(),
                                                          "Halfling max", professionsRoll.getHalMax(),
                                                          "High elf min", professionsRoll.getHElfMin(),
                                                          "High elf max", professionsRoll.getHElfMax(),
                                                          "Wood elf min", professionsRoll.getWElfMin(),
                                                          "Wood elf max", professionsRoll.getWElfMax()));
        
        return new ProfessionDto(professionsRoll.getClassField(),
                                 professionsRoll.getName(),
                                 professionsRoll.getDescription(),
                                 professionsRoll.getStatus(),
                                 rolls);
    }
    
    public List<ProfessionDto> mapProfessionsRollsListToProfessionDtoList(List<ProfessionsRoll> list) {
        return list.stream()
                   .map(this::mapProfessionsRollToProfessionDto)
                   .toList();
    }
}
