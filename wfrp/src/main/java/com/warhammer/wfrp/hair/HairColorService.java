package com.warhammer.wfrp.hair;

import com.warhammer.wfrp.engine.DiceRoller;
import com.warhammer.wfrp.hair.models.*;
import com.warhammer.wfrp.hair.repositories.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class HairColorService {
    
    private final DwarfHairColorRepository dwarfHairColorRepository;
    private final HalflingHairColorRepository halflingHairColorRepository;
    private final HighElfHairColorRepository highElfHairColorRepository;
    private final HumanHairColorRepository humanHairColorRepository;
    private final WoodElfHairColorRepository woodElfHairColorRepository;
    private final DiceRoller roller;
    private final HairColorMapper hairColorMapper;
    
    public Set<HairColorDto> getAllDwarfHairColorsList() {
        List<DwarfHairColor> dwarfHairColors = dwarfHairColorRepository.findAll();
        return hairColorMapper.mapHairColorListToHairColorDtoSet(List.copyOf(dwarfHairColors));
    }
    
    public HairColorDto getRandomDwarfHairColor() {
        int result = roller.rollK20();
        Optional<DwarfHairColor> dwarfHairColor = dwarfHairColorRepository.findById(result);
        return dwarfHairColor.map(hairColorMapper::mapHairColorToHairColorDto).orElse(null);
    }
    
    public Set<HairColorDto> getAllHalflingHairColorsList() {
        List<HalflingHairColor> halflingHairColors = halflingHairColorRepository.findAll();
        return hairColorMapper.mapHairColorListToHairColorDtoSet(List.copyOf(halflingHairColors));
    }
    
    public HairColorDto getRandomHalflingHairColor() {
        int result = roller.rollK20();
        Optional<HalflingHairColor> halflingHairColor = halflingHairColorRepository.findById(result);
        return halflingHairColor.map(hairColorMapper::mapHairColorToHairColorDto).orElse(null);
    }
    
    public Set<HairColorDto> getAllHighElfHairColorsList() {
        List<HighElfHairColor> highElfHairColors = highElfHairColorRepository.findAll();
        return hairColorMapper.mapHairColorListToHairColorDtoSet(List.copyOf(highElfHairColors));
    }
    
    public HairColorDto getRandomHighElfHairColor() {
        int result = roller.rollK20();
        Optional<HighElfHairColor> highElfHairColor = highElfHairColorRepository.findById(result);
        return highElfHairColor.map(hairColorMapper::mapHairColorToHairColorDto).orElse(null);
    }
    
    public Set<HairColorDto> getAllHumanHairColorsList() {
        List<HumanHairColor> humanHairColors = humanHairColorRepository.findAll();
        return hairColorMapper.mapHairColorListToHairColorDtoSet(List.copyOf(humanHairColors));
    }
    
    public HairColorDto getRandomHumanHairColor() {
        int result = roller.rollK20();
        Optional<HumanHairColor> humanHairColor = humanHairColorRepository.findById(result);
        return humanHairColor.map(hairColorMapper::mapHairColorToHairColorDto).orElse(null);
    }
    
    public Set<HairColorDto> getAllWoodElfHairColorsList() {
        List<WoodElfHairColor> woodElfHairColors = woodElfHairColorRepository.findAll();
        return hairColorMapper.mapHairColorListToHairColorDtoSet(List.copyOf(woodElfHairColors));
    }
    
    public HairColorDto getRandomWoodElfHairColor() {
        int result = roller.rollK20();
        Optional<WoodElfHairColor> woodElfHairColor = woodElfHairColorRepository.findById(result);
        return woodElfHairColor.map(hairColorMapper::mapHairColorToHairColorDto).orElse(null);
    }
}
