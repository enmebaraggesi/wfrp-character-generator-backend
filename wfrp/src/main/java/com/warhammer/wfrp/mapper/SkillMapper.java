package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.skill.SkillDto;
import com.warhammer.wfrp.model.skill.Skill;
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
