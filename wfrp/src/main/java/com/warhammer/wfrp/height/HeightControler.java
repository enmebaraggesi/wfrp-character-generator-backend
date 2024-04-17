package com.warhammer.wfrp.height;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("height")
public class HeightControler {
    
    private final HeightService service;
    
    @GetMapping("{race}")
    public HeightDto getHeightByRace(@PathVariable String race) {
        return service.getHeightByRace(race);
    }
}
