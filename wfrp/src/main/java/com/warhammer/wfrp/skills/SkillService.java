package com.warhammer.wfrp.skills;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SkillService {
    
    private final SkillRepository repository;
    private final SkillMapper mapper;
    
    public List<SkillDto> getAllSkillsList() {
        List<Skill> skills = repository.findAll();
        return mapper.mapSkillListToSkillDtoList(skills);
    }
    
    public List<SkillDto> getAllBasicSkillsList() {
        List<Skill> basicSkills = repository.findAllByIsAdvanced(false);
        return mapper.mapSkillListToSkillDtoList(basicSkills);
    }
    
    public List<SkillDto> getAllAdvancedSkillsList() {
        List<Skill> advancedSkills = repository.findAllByIsAdvanced(true);
        return mapper.mapSkillListToSkillDtoList(advancedSkills);
    }
}
