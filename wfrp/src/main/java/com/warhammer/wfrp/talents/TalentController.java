package com.warhammer.wfrp.talents;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("talents")
public class TalentController {
    
    private final TalentService service;
    
    @GetMapping
    public List<TalentDto> getAllTalents() {
        return service.getAllTalentsList();
    }
    
    @GetMapping("random")
    public TalentDto getRandomTalent() {
        return service.getRandomTalent();
    }
}
