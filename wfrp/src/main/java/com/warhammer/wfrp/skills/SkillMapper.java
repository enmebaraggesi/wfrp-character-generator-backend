package com.warhammer.wfrp.skills;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillMapper {
    
    private SkillDto mapSkillToSkillDto(Skill skill) {
        return new SkillDto(skill.getName(),
                            skill.getAttribute(),
                            skill.getIsGroup(),
                            skill.getDescription());
    }
    
    public List<SkillDto> mapSkillListToSkillDtoList(List<Skill> list) {
        return list.stream()
                   .map(this::mapSkillToSkillDto)
                   .toList();
    }
}
