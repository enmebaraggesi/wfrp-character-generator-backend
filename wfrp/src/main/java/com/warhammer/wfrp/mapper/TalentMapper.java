package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.talent.TalentDto;
import com.warhammer.wfrp.model.talent.Talent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TalentMapper {
    
    public TalentDto mapTalentToTalentDto(Talent talent) {
        return new TalentDto(talent.getName(),
                             talent.getMaxValue(),
                             talent.getBonus(),
                             talent.getTested(),
                             talent.getDescription());
    }
    
    public List<TalentDto> mapTalentListToTalentDtoList(List<Talent> list) {
        return list.stream()
                   .map(this::mapTalentToTalentDto)
                   .toList();
    }
}
