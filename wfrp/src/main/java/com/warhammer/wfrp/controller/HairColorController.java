package com.warhammer.wfrp.controller;

import com.warhammer.wfrp.dto.HairColorDto;
import com.warhammer.wfrp.mapper.HairColorMapper;
import com.warhammer.wfrp.model.*;
import com.warhammer.wfrp.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController("/hairs")
public class HairColorController {
    
    private final DwarfHairColorRepository dwarfHairColorRepository;
    private final HalflingHairColorRepository halflingHairColorRepository;
    private final HighElfHairColorRepository highElfHairColorRepository;
    private final HumanHairColorRepository humanHairColorRepository;
    private final WoodElfHairColorRepository woodElfHairColorRepository;
    private final HairColorMapper hairColorMapper;
    
    @GetMapping("/dwarfs")
    public List<HairColorDto> getAllDwarfHairColors() {
        List<DwarfHairColor> dwarfHairColors = dwarfHairColorRepository.findAll();
        return hairColorMapper.mapHairColorListToHairColorListDto(List.copyOf(dwarfHairColors));
    }
    
    @GetMapping("/dwarfs/{id}")
    public HairColorDto getDwarfHairColorById(@PathVariable int id) {
        Optional<DwarfHairColor> dwarfHairColor = dwarfHairColorRepository.findById(id);
        return dwarfHairColor.map(hairColorMapper::mapHairColorToHairColorDto).orElse(null);
    }
    
    @GetMapping("/halflings")
    public List<HairColorDto> getAllHalflingHairColors() {
        List<HalflingHairColor> halflingHairColors = halflingHairColorRepository.findAll();
        return hairColorMapper.mapHairColorListToHairColorListDto(List.copyOf(halflingHairColors));
    }
    
    @GetMapping("/halflings/{id}")
    public HairColorDto getHalflingHairColorById(@PathVariable int id) {
        Optional<HalflingHairColor> halflingHairColor = halflingHairColorRepository.findById(id);
        return halflingHairColor.map(hairColorMapper::mapHairColorToHairColorDto).orElse(null);
    }
    
    @GetMapping("/helves")
    public List<HairColorDto> getAllHighElfHairColors() {
        List<HighElfHairColor> highElfHairColors = highElfHairColorRepository.findAll();
        return hairColorMapper.mapHairColorListToHairColorListDto(List.copyOf(highElfHairColors));
    }
    
    @GetMapping("/helves/{id}")
    public HairColorDto getHighElvesHairColorById(@PathVariable int id) {
        Optional<HighElfHairColor> highElfHairColor = highElfHairColorRepository.findById(id);
        return highElfHairColor.map(hairColorMapper::mapHairColorToHairColorDto).orElse(null);
    }
    
    @GetMapping("/humans")
    public List<HairColorDto> getAllHumanHairColors() {
        List<HumanHairColor> humanHairColors = humanHairColorRepository.findAll();
        return hairColorMapper.mapHairColorListToHairColorListDto(List.copyOf(humanHairColors));
    }
    
    @GetMapping("/humans/{id}")
    public HairColorDto getHumanHairColorById(@PathVariable int id) {
        Optional<HumanHairColor> humanHairColor = humanHairColorRepository.findById(id);
        return humanHairColor.map(hairColorMapper::mapHairColorToHairColorDto).orElse(null);
    }
    
    @GetMapping("/welves")
    public List<HairColorDto> getAllWoodElfHairColors() {
        List<WoodElfHairColor> woodElfHairColors = woodElfHairColorRepository.findAll();
        return hairColorMapper.mapHairColorListToHairColorListDto(List.copyOf(woodElfHairColors));
    }
    
    @GetMapping("/welves/{id}")
    public HairColorDto getWoodElfHairColorById(@PathVariable int id) {
        Optional<WoodElfHairColor> woodElfHairColor = woodElfHairColorRepository.findById(id);
        return woodElfHairColor.map(hairColorMapper::mapHairColorToHairColorDto).orElse(null);
    }
}
