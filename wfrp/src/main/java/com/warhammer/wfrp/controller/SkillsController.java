package com.warhammer.wfrp.controller;

import com.warhammer.wfrp.dto.SkillDto;
import com.warhammer.wfrp.mapper.SkillMapper;
import com.warhammer.wfrp.model.skills.Skill;
import com.warhammer.wfrp.repository.skills.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class SkillsController {
    
    private final SkillRepository repository;
    private final SkillMapper mapper;
    
    @GetMapping("/skills/basic")
    public List<SkillDto> getAllBasicSkills() {
        List<Skill> basicSkills = repository.findAllByIsAdvanced(false);
        return mapper.mapSkillListToSkillDtoList(basicSkills);
    }
    
    @GetMapping("/skills/advanced")
    public List<SkillDto> getAllAdvancedSkills() {
        List<Skill> advancedSkills = repository.findAllByIsAdvanced(true);
        return mapper.mapSkillListToSkillDtoList(advancedSkills);
    }
    
    @GetMapping("/skills")
    public List<SkillDto> getAllSkills() {
        List<Skill> skills = repository.findAll();
        return mapper.mapSkillListToSkillDtoList(skills);
    }
}
