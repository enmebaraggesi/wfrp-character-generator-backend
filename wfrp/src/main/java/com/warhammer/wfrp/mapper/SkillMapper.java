package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.SkillDto;
import com.warhammer.wfrp.model.skills.Skill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillMapper {
    
    public List<SkillDto> mapSkillListToSkillDtoList(List<Skill> basicSkills) {
        return basicSkills.stream()
                          .map(this::mapSkillToSkillDto)
                          .toList();
    }
    
    private SkillDto mapSkillToSkillDto(Skill skill) {
        return new SkillDto(skill.getName(),
                            skill.getAttribute(),
                            skill.getIsAdvanced(),
                            skill.getIsGroup(),
                            skill.getDescription());
    }
}
