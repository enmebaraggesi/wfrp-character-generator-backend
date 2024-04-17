package com.warhammer.wfrp.professions;

import com.warhammer.wfrp.dto.appearance.RaceDto;
import com.warhammer.wfrp.engine.DiceRoller;
import com.warhammer.wfrp.mapper.RaceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfessionService {
    
    private final ProfessionRepository repository;
    private final ProfessionsMapper mapper;
    private final RaceMapper raceMapper;
    private final DiceRoller roller;
    
    public List<ProfessionDto> getAllProfessionsList() {
        List<Profession> professions = repository.findAll();
        return mapper.mapProfessionListToProfessionDtoList(professions);
    }
    
    //TODO obsługa błędów
    public ProfessionDto getRandomProfessionByRace(RaceDto raceDto) {
        int result = roller.rollK100();
        List<Profession> professions = repository.findAll();
        for (Profession profession : professions) {
            switch (raceMapper.mapRaceDtoToRaceName(raceDto)) {
                case "Krasnolud" -> {
                    return isAvailableForDwarf(profession, result) ? mapper.mapProfessionToProfessionDto(profession) : null;
                }
                case "Niziołek" -> {
                    return isAvailableForHalfling(profession, result) ? mapper.mapProfessionToProfessionDto(profession) : null;
                }
                case "Wysoki elf" -> {
                    return isAvailableForHighElf(profession, result) ? mapper.mapProfessionToProfessionDto(profession) : null;
                }
                case "Leśny elf" -> {
                    return isAvailableForWoodElf(profession, result) ? mapper.mapProfessionToProfessionDto(profession) : null;
                }
                default -> {
                    return isAvailableForHuman(profession, result) ? mapper.mapProfessionToProfessionDto(profession) : null;
                }
            }
        }
        return null;
    }
    
    private static boolean isAvailableForWoodElf(Profession profession, int result) {
        return profession.getWElfMin() != null && profession.getWElfMin() <= result && result <= profession.getWElfMax();
    }
    
    private static boolean isAvailableForHighElf(Profession profession, int result) {
        return profession.getHElfMin() != null && profession.getHElfMin() <= result && result <= profession.getHElfMax();
    }
    
    private static boolean isAvailableForHalfling(Profession profession, int result) {
        return profession.getHalMin() != null && profession.getHalMin() <= result && result <= profession.getHalMax();
    }
    
    private static boolean isAvailableForDwarf(Profession profession, int result) {
        return profession.getDwMin() != null && profession.getDwMin() <= result && result <= profession.getDwMax();
    }
    
    private static boolean isAvailableForHuman(Profession profession, int result) {
        return profession.getHuMin() != null && profession.getHuMin() <= result && result <= profession.getHuMax();
    }
}
