package com.warhammer.wfrp.eyes;

import com.warhammer.wfrp.engine.DiceRoller;
import com.warhammer.wfrp.eyes.models.*;
import com.warhammer.wfrp.eyes.repositories.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class EyeColorService {
    
    private final DwarfEyeColorRepository dwarfEyeColorRepository;
    private final HalflingEyeColorRepository halflingEyeColorRepository;
    private final HighElfEyeColorRepository highElfEyeColorRepository;
    private final HumanEyeColorRepository humanEyeColorRepository;
    private final WoodElfEyeColorRepository woodElfEyeColorRepository;
    private final DiceRoller roller;
    private final EyeColorMapper eyeColorMapper;
    
    
    public Set<EyeColorDto> getAllDwarfEyeColorsList() {
        List<DwarfEyeColor> dwarfEyeColors = dwarfEyeColorRepository.findAll();
        return eyeColorMapper.mapEyeColorListToEyeColorDtoSet(List.copyOf(dwarfEyeColors));
    }
    
    public EyeColorDto getRandomDwarfEyeColor() {
        int result = roller.rollK20();
        Optional<DwarfEyeColor> dwarfEyeColor = dwarfEyeColorRepository.findById(result);
        return dwarfEyeColor.map(eyeColorMapper::mapEyeColorToEyeColorDto).orElse(null);
    }
    
    public Set<EyeColorDto> getAllHalflingEyeColorsList() {
        List<HalflingEyeColor> halflingEyeColors = halflingEyeColorRepository.findAll();
        return eyeColorMapper.mapEyeColorListToEyeColorDtoSet(List.copyOf(halflingEyeColors));
    }
    
    public EyeColorDto getRandomHalflingEyeColor() {
        int result = roller.rollK20();
        Optional<HalflingEyeColor> halflingEyeColor = halflingEyeColorRepository.findById(result);
        return halflingEyeColor.map(eyeColorMapper::mapEyeColorToEyeColorDto).orElse(null);
    }
    
    public Set<EyeColorDto> getAllHighElfEyeColorsList() {
        List<HighElfEyeColor> highElfEyeColors = highElfEyeColorRepository.findAll();
        return eyeColorMapper.mapEyeColorListToEyeColorDtoSet(List.copyOf(highElfEyeColors));
    }
    
    public EyeColorDto getRandomHighElfEyeColor() {
        int result = roller.rollK20();
        Optional<HighElfEyeColor> highElfEyeColor = highElfEyeColorRepository.findById(result);
        return highElfEyeColor.map(eyeColorMapper::mapEyeColorToEyeColorDto).orElse(null);
    }
    
    public Set<EyeColorDto> getAllHumanEyeColorsList() {
        List<HumanEyeColor> humanEyeColors = humanEyeColorRepository.findAll();
        return eyeColorMapper.mapEyeColorListToEyeColorDtoSet(List.copyOf(humanEyeColors));
    }
    
    public EyeColorDto getRandomHumanEyeColor() {
        int result = roller.rollK20();
        Optional<HumanEyeColor> humanEyeColor = humanEyeColorRepository.findById(result);
        return humanEyeColor.map(eyeColorMapper::mapEyeColorToEyeColorDto).orElse(null);
    }
    
    public Set<EyeColorDto> getAllWoodElfEyeColorsList() {
        List<WoodElfEyeColor> woodElfEyeColors = woodElfEyeColorRepository.findAll();
        return eyeColorMapper.mapEyeColorListToEyeColorDtoSet(List.copyOf(woodElfEyeColors));
    }
    
    public EyeColorDto getRandomWoodElfEyeColor() {
        int result = roller.rollK20();
        Optional<WoodElfEyeColor> woodElfEyeColor = woodElfEyeColorRepository.findById(result);
        return woodElfEyeColor.map(eyeColorMapper::mapEyeColorToEyeColorDto).orElse(null);
    }
}
