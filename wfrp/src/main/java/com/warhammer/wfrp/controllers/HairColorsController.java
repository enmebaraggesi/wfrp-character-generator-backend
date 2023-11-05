package com.warhammer.wfrp.controllers;

import com.warhammer.wfrp.dto.HairColorDto;
import com.warhammer.wfrp.mapper.HairColorMapper;
import com.warhammer.wfrp.model.hair.*;
import com.warhammer.wfrp.repository.hair.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RequiredArgsConstructor
@RestController
public class HairColorsController {
    
    private final DwarfHairColorRepository dwarfHairColorRepository;
    private final HalflingHairColorRepository halflingHairColorRepository;
    private final HighElfHairColorRepository highElfHairColorRepository;
    private final HumanHairColorRepository humanHairColorRepository;
    private final WoodElfHairColorRepository woodElfHairColorRepository;
    private final HairColorMapper hairColorMapper;
    
    @GetMapping("/hair/dwarfs")
    public Set<HairColorDto> getAllDwarfHairColors() {
        List<DwarfHairColor> dwarfHairColors = dwarfHairColorRepository.findAll();
        return hairColorMapper.mapHairColorListToHairColorDtoSet(List.copyOf(dwarfHairColors));
    }
    
    @GetMapping("/hair/dwarfs/random")
    public HairColorDto getDwarfHairColorByRandomId() {
        int result = new Random().nextInt(1, 21);
        Optional<DwarfHairColor> dwarfHairColor = dwarfHairColorRepository.findById(result);
        return dwarfHairColor.map(hairColorMapper::mapHairColorToHairColorDto).orElse(null);
    }
    
    @GetMapping("/hair/halflings")
    public Set<HairColorDto> getAllHalflingHairColors() {
        List<HalflingHairColor> halflingHairColors = halflingHairColorRepository.findAll();
        return hairColorMapper.mapHairColorListToHairColorDtoSet(List.copyOf(halflingHairColors));
    }
    
    @GetMapping("/hair/halflings/random")
    public HairColorDto getHalflingHairColorByRandomId() {
        int result = new Random().nextInt(1, 21);
        Optional<HalflingHairColor> halflingHairColor = halflingHairColorRepository.findById(result);
        return halflingHairColor.map(hairColorMapper::mapHairColorToHairColorDto).orElse(null);
    }
    
    @GetMapping("/hair/helves")
    public Set<HairColorDto> getAllHighElfHairColors() {
        List<HighElfHairColor> highElfHairColors = highElfHairColorRepository.findAll();
        return hairColorMapper.mapHairColorListToHairColorDtoSet(List.copyOf(highElfHairColors));
    }
    
    @GetMapping("/hair/helves/random")
    public HairColorDto getHighElvesHairColorByRandomId() {
        int result = new Random().nextInt(1, 21);
        Optional<HighElfHairColor> highElfHairColor = highElfHairColorRepository.findById(result);
        return highElfHairColor.map(hairColorMapper::mapHairColorToHairColorDto).orElse(null);
    }
    
    @GetMapping("/hair/humans")
    public Set<HairColorDto> getAllHumanHairColors() {
        List<HumanHairColor> humanHairColors = humanHairColorRepository.findAll();
        return hairColorMapper.mapHairColorListToHairColorDtoSet(List.copyOf(humanHairColors));
    }
    
    @GetMapping("/hair/humans/random")
    public HairColorDto getHumanHairColorByRandomId() {
        int result = new Random().nextInt(1, 21);
        Optional<HumanHairColor> humanHairColor = humanHairColorRepository.findById(result);
        return humanHairColor.map(hairColorMapper::mapHairColorToHairColorDto).orElse(null);
    }
    
    @GetMapping("/hair/welves")
    public Set<HairColorDto> getAllWoodElfHairColors() {
        List<WoodElfHairColor> woodElfHairColors = woodElfHairColorRepository.findAll();
        return hairColorMapper.mapHairColorListToHairColorDtoSet(List.copyOf(woodElfHairColors));
    }
    
    @GetMapping("/hair/welves/random")
    public HairColorDto getWoodElfHairColorByRandomId() {
        int result = new Random().nextInt(1, 21);
        Optional<WoodElfHairColor> woodElfHairColor = woodElfHairColorRepository.findById(result);
        return woodElfHairColor.map(hairColorMapper::mapHairColorToHairColorDto).orElse(null);
    }
}
