package com.warhammer.wfrp.hair;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("hair")
public class HairColorsController {
    
    private final HairColorService service;
    
    @GetMapping("dwarfs")
    public Set<HairColorDto> getAllDwarfHairColors() {
        return service.getAllDwarfHairColorsList();
    }
    
    @GetMapping("dwarfs/random")
    public HairColorDto getDwarfHairColorByRandomId() {
        return service.getRandomDwarfHairColor();
    }
    
    @GetMapping("halflings")
    public Set<HairColorDto> getAllHalflingHairColors() {
        return service.getAllHalflingHairColorsList();
    }
    
    @GetMapping("halflings/random")
    public HairColorDto getHalflingHairColorByRandomId() {
        return service.getRandomHalflingHairColor();
    }
    
    @GetMapping("helves")
    public Set<HairColorDto> getAllHighElfHairColors() {
        return service.getAllHighElfHairColorsList();
    }
    
    @GetMapping("helves/random")
    public HairColorDto getHighElvesHairColorByRandomId() {
        return service.getRandomHighElfHairColor();
    }
    
    @GetMapping("humans")
    public Set<HairColorDto> getAllHumanHairColors() {
        return service.getAllHumanHairColorsList();
    }
    
    @GetMapping("humans/random")
    public HairColorDto getHumanHairColorByRandomId() {
        return service.getRandomHumanHairColor();
    }
    
    @GetMapping("welves")
    public Set<HairColorDto> getAllWoodElfHairColors() {
        return service.getAllWoodElfHairColorsList();
    }
    
    @GetMapping("welves/random")
    public HairColorDto getWoodElfHairColorByRandomId() {
        return service.getRandomWoodElfHairColor();
    }
}
