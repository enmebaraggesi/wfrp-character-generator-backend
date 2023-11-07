package com.warhammer.wfrp.controller;

import com.warhammer.wfrp.dto.talent.TalentDto;
import com.warhammer.wfrp.service.TalentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("talents")
public class TalentsController {
    
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
