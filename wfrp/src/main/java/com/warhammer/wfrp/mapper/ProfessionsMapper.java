package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.ProfessionDto;
import com.warhammer.wfrp.model.ProfessionsRoll;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionsMapper {
    
    public List<ProfessionDto> mapProfessionsRollsListToProfessionDtoList(List<ProfessionsRoll> professionsRolls) {
        return professionsRolls.stream()
                               .map(this::mapProfessionsRollToProfessionDto)
                               .toList();
    }
    
    public ProfessionDto mapProfessionsRollToProfessionDto(ProfessionsRoll professionsRoll) {
        return new ProfessionDto(professionsRoll.getClassField(),
                                 professionsRoll.getName(),
                                 professionsRoll.getDescription());
    }
}
