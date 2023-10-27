package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.SkillDto;
import com.warhammer.wfrp.model.skills.Skill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillMapper {
    
    private SkillDto mapSkillToSkillDto(Skill skill) {
        return new SkillDto(skill.getName(),
                            skill.getAttribute(),
                            skill.getIsAdvanced(),
                            skill.getIsGroup(),
                            skill.getDescription());
    }
    
    public List<SkillDto> mapSkillListToSkillDtoList(List<Skill> list) {
        return list.stream()
                   .map(this::mapSkillToSkillDto)
                   .toList();
    }
}
