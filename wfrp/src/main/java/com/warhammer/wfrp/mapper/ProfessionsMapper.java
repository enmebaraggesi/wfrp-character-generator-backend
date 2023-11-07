package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.profession.ProfessionDto;
import com.warhammer.wfrp.model.profession.Profession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionsMapper {
    
    public ProfessionDto mapProfessionToProfessionDto(Profession profession) {
        return new ProfessionDto(profession.getClassField(),
                                 profession.getName(),
                                 profession.getDescription(),
                                 profession.getStatus());
    }
    
    public List<ProfessionDto> mapProfessionListToProfessionDtoList(List<Profession> list) {
        return list.stream()
                   .map(this::mapProfessionToProfessionDto)
                   .toList();
    }
}
