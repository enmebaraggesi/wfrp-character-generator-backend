package com.warhammer.wfrp.eyes;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("eyes")
public class EyeColorsController {
    
    private final EyeColorService service;
    
    @GetMapping("dwarfs")
    public Set<EyeColorDto> getAllDwarfEyeColors() {
        return service.getAllDwarfEyeColorsList();
    }
    
    @GetMapping("dwarfs/random")
    public EyeColorDto getDwarfEyeColorByRandomId() {
        return service.getRandomDwarfEyeColor();
    }
    
    @GetMapping("halflings")
    public Set<EyeColorDto> getAllHalflingEyeColors() {
        return service.getAllHalflingEyeColorsList();
    }
    
    @GetMapping("halflings/random")
    public EyeColorDto getHalflingEyeColorByRandomId() {
        return service.getRandomHalflingEyeColor();
    }
    
    @GetMapping("helves")
    public Set<EyeColorDto> getAllHighElfEyeColors() {
        return service.getAllHighElfEyeColorsList();
    }
    
    @GetMapping("helves/random")
    public EyeColorDto getHighElvesEyeColorByRandomId() {
        return service.getRandomHighElfEyeColor();
    }
    
    @GetMapping("humans")
    public Set<EyeColorDto> getAllHumanEyeColors() {
        return service.getAllHumanEyeColorsList();
    }
    
    @GetMapping("humans/random")
    public EyeColorDto getHumanEyeColorByRandomId() {
        return service.getRandomHumanEyeColor();
    }
    
    @GetMapping("welves")
    public Set<EyeColorDto> getAllWoodElfEyeColors() {
        return service.getAllWoodElfEyeColorsList();
    }
    
    @GetMapping("welves/random")
    public EyeColorDto getWoodElfEyeColorByRandomId() {
        return service.getRandomWoodElfEyeColor();
    }
}
