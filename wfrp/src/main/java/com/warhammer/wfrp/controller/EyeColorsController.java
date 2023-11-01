package com.warhammer.wfrp.controller;

import com.warhammer.wfrp.dto.EyeColorDto;
import com.warhammer.wfrp.mapper.EyeColorMapper;
import com.warhammer.wfrp.model.eyes.*;
import com.warhammer.wfrp.repository.eyes.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RequiredArgsConstructor
@RestController
public class EyeColorsController {
    
    private final DwarfEyeColorRepository dwarfEyeColorRepository;
    private final HalflingEyeColorRepository halflingEyeColorRepository;
    private final HighElfEyeColorRepository highElfEyeColorRepository;
    private final HumanEyeColorRepository humanEyeColorRepository;
    private final WoodElfEyeColorRepository woodElfEyeColorRepository;
    private final EyeColorMapper eyeColorMapper;
    
    @GetMapping("/eyes/dwarfs")
    public Set<EyeColorDto> getAllDwarfEyeColors() {
        List<DwarfEyeColor> dwarfEyeColors = dwarfEyeColorRepository.findAll();
        return eyeColorMapper.mapEyeColorListToEyeColorDtoSet(List.copyOf(dwarfEyeColors));
    }
    
    @GetMapping("/eyes/dwarfs/random")
    public EyeColorDto getDwarfEyeColorByRandomId() {
        int result = new Random().nextInt(1, 21);
        Optional<DwarfEyeColor> dwarfEyeColor = dwarfEyeColorRepository.findById(result);
        return dwarfEyeColor.map(eyeColorMapper::mapEyeColorToEyeColorDto).orElse(null);
    }
    
    @GetMapping("/eyes/halflings")
    public Set<EyeColorDto> getAllHalflingEyeColors() {
        List<HalflingEyeColor> halflingEyeColors = halflingEyeColorRepository.findAll();
        return eyeColorMapper.mapEyeColorListToEyeColorDtoSet(List.copyOf(halflingEyeColors));
    }
    
    @GetMapping("/eyes/halflings/random")
    public EyeColorDto getHalflingEyeColorByRandomId() {
        int result = new Random().nextInt(1, 21);
        Optional<HalflingEyeColor> halflingEyeColor = halflingEyeColorRepository.findById(result);
        return halflingEyeColor.map(eyeColorMapper::mapEyeColorToEyeColorDto).orElse(null);
    }
    
    @GetMapping("/eyes/helves")
    public Set<EyeColorDto> getAllHighElfEyeColors() {
        List<HighElfEyeColor> highElfEyeColors = highElfEyeColorRepository.findAll();
        return eyeColorMapper.mapEyeColorListToEyeColorDtoSet(List.copyOf(highElfEyeColors));
    }
    
    @GetMapping("/eyes/helves/random")
    public EyeColorDto getHighElvesEyeColorByRandomId() {
        int result = new Random().nextInt(1, 21);
        Optional<HighElfEyeColor> highElfEyeColor = highElfEyeColorRepository.findById(result);
        return highElfEyeColor.map(eyeColorMapper::mapEyeColorToEyeColorDto).orElse(null);
    }
    
    @GetMapping("/eyes/humans")
    public Set<EyeColorDto> getAllHumanEyeColors() {
        List<HumanEyeColor> humanEyeColors = humanEyeColorRepository.findAll();
        return eyeColorMapper.mapEyeColorListToEyeColorDtoSet(List.copyOf(humanEyeColors));
    }
    
    @GetMapping("/eyes/humans/random")
    public EyeColorDto getHumanEyeColorByRandomId() {
        int result = new Random().nextInt(1, 21);
        Optional<HumanEyeColor> humanEyeColor = humanEyeColorRepository.findById(result);
        return humanEyeColor.map(eyeColorMapper::mapEyeColorToEyeColorDto).orElse(null);
    }
    
    @GetMapping("/eyes/welves")
    public Set<EyeColorDto> getAllWoodElfEyeColors() {
        List<WoodElfEyeColor> woodElfEyeColors = woodElfEyeColorRepository.findAll();
        return eyeColorMapper.mapEyeColorListToEyeColorDtoSet(List.copyOf(woodElfEyeColors));
    }
    
    @GetMapping("/eyes/welves/random")
    public EyeColorDto getWoodElfEyeColorByRandomId() {
        int result = new Random().nextInt(1, 21);
        Optional<WoodElfEyeColor> woodElfEyeColor = woodElfEyeColorRepository.findById(result);
        return woodElfEyeColor.map(eyeColorMapper::mapEyeColorToEyeColorDto).orElse(null);
    }
}
