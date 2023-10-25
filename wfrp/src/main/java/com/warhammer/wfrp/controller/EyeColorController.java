package com.warhammer.wfrp.controller;

import com.warhammer.wfrp.dto.EyeColorDto;
import com.warhammer.wfrp.mapper.EyeColorMapper;
import com.warhammer.wfrp.model.*;
import com.warhammer.wfrp.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class EyeColorController {
    
    private final DwarfEyeColorRepository dwarfEyeColorRepository;
    private final HalflingEyeColorRepository halflingEyeColorRepository;
    private final HighElfEyeColorRepository highElfEyeColorRepository;
    private final HumanEyeColorRepository humanEyeColorRepository;
    private final WoodElfEyeColorRepository woodElfEyeColorRepository;
    private final EyeColorMapper eyeColorMapper;
    
    @GetMapping("/eyes/dwarfs")
    public List<EyeColorDto> getAllDwarfEyeColors() {
        List<DwarfEyeColor> dwarfEyeColors = dwarfEyeColorRepository.findAll();
        return eyeColorMapper.mapEyeColorListToEyeColorDtoList(List.copyOf(dwarfEyeColors));
    }
    
    @GetMapping("/eyes/dwarfs/{id}")
    public EyeColorDto getDwarfEyeColorById(@PathVariable int id) {
        Optional<DwarfEyeColor> dwarfEyeColor = dwarfEyeColorRepository.findById(id);
        return dwarfEyeColor.map(eyeColorMapper::mapEyeColorToEyeColorDto).orElse(null);
    }
    
    @GetMapping("/eyes/halflings")
    public List<EyeColorDto> getAllHalflingEyeColors() {
        List<HalflingEyeColor> halflingEyeColors = halflingEyeColorRepository.findAll();
        return eyeColorMapper.mapEyeColorListToEyeColorDtoList(List.copyOf(halflingEyeColors));
    }
    
    @GetMapping("/eyes/halflings/{id}")
    public EyeColorDto getHalflingEyeColorById(@PathVariable int id) {
        Optional<HalflingEyeColor> halflingEyeColor = halflingEyeColorRepository.findById(id);
        return halflingEyeColor.map(eyeColorMapper::mapEyeColorToEyeColorDto).orElse(null);
    }
    
    @GetMapping("/eyes/helves")
    public List<EyeColorDto> getAllHighElfEyeColors() {
        List<HighElfEyeColor> highElfEyeColors = highElfEyeColorRepository.findAll();
        return eyeColorMapper.mapEyeColorListToEyeColorDtoList(List.copyOf(highElfEyeColors));
    }
    
    @GetMapping("/eyes/helves/{id}")
    public EyeColorDto getHighElvesEyeColorById(@PathVariable int id) {
        Optional<HighElfEyeColor> highElfEyeColor = highElfEyeColorRepository.findById(id);
        return highElfEyeColor.map(eyeColorMapper::mapEyeColorToEyeColorDto).orElse(null);
    }
    
    @GetMapping("/eyes/humans")
    public List<EyeColorDto> getAllHumanEyeColors() {
        List<HumanEyeColor> humanEyeColors = humanEyeColorRepository.findAll();
        return eyeColorMapper.mapEyeColorListToEyeColorDtoList(List.copyOf(humanEyeColors));
    }
    
    @GetMapping("/eyes/humans/{id}")
    public EyeColorDto getHumanEyeColorById(@PathVariable int id) {
        Optional<HumanEyeColor> humanEyeColor = humanEyeColorRepository.findById(id);
        return humanEyeColor.map(eyeColorMapper::mapEyeColorToEyeColorDto).orElse(null);
    }
    
    @GetMapping("/eyes/welves")
    public List<EyeColorDto> getAllWoodElfEyeColors() {
        List<WoodElfEyeColor> woodElfEyeColors = woodElfEyeColorRepository.findAll();
        return eyeColorMapper.mapEyeColorListToEyeColorDtoList(List.copyOf(woodElfEyeColors));
    }
    
    @GetMapping("/eyes/welves/{id}")
    public EyeColorDto getWoodElfEyeColorById(@PathVariable int id) {
        Optional<WoodElfEyeColor> woodElfEyeColor = woodElfEyeColorRepository.findById(id);
        return woodElfEyeColor.map(eyeColorMapper::mapEyeColorToEyeColorDto).orElse(null);
    }
}
