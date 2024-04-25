package com.warhammer.wfrp.skills;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("skills")
public class SkillsController {
    
    private final SkillService service;
    
    @GetMapping
    public List<SkillDto> getAllSkills() {
        return service.getAllSkillsList();
    }
    
    @GetMapping("basic")
    public List<SkillDto> getAllBasicSkills() {
        return service.getAllBasicSkillsList();
    }
    
    @GetMapping("advanced")
    public List<SkillDto> getAllAdvancedSkills() {
        return service.getAllAdvancedSkillsList();
    }
}
