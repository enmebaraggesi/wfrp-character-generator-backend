package com.warhammer.wfrp.controller;

import com.warhammer.wfrp.dto.TalentDto;
import com.warhammer.wfrp.service.TalentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TalentsController {
    
    private final TalentService service;
    
    @GetMapping("/talents")
    public List<TalentDto> getAllTalents() {
        return service.getAllTalents();
    }
    
    @GetMapping("/talents/random")
    public TalentDto getTalentByChance() {
        return service.getTalentByChance();
    }
}
