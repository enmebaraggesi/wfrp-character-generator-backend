package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.ProfessionDto;
import com.warhammer.wfrp.model.professions.ProfessionsRoll;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionsMapper {
    
    public ProfessionDto mapProfessionsRollToProfessionDto(ProfessionsRoll professionsRoll) {
        return new ProfessionDto(professionsRoll.getClassField(),
                                 professionsRoll.getName(),
                                 professionsRoll.getDescription());
    }
    
    public List<ProfessionDto> mapProfessionsRollsListToProfessionDtoList(List<ProfessionsRoll> list) {
        return list.stream()
                   .map(this::mapProfessionsRollToProfessionDto)
                   .toList();
    }
}
