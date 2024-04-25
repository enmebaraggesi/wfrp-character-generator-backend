package com.warhammer.wfrp.character_sheets.mappers;

import com.warhammer.wfrp.character_sheets.dto.CharacterSheetSkillsBasicDto;
import com.warhammer.wfrp.character_sheets.models.*;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SheetBasicSkillsMapper {
    
    
    public CharacterSheetBasicSkills mapSheetBasicSkillsDtoToSheetBasicSkills(CharacterSheetSkillsBasicDto characterSheetSkillsBasicDto) {
        if (characterSheetSkillsBasicDto == null) {
            return null;
        }
        Set<CharacterSheetBasicSkillsDevelopmentLeft> developmentLeftSet = new HashSet<>();
        characterSheetSkillsBasicDto.developmentValuesLeft().forEach(s -> {
            CharacterSheetBasicSkillsDevelopmentLeft developmentLeft = new CharacterSheetBasicSkillsDevelopmentLeft();
            developmentLeft.setValue(s);
            developmentLeftSet.add(developmentLeft);
        });
        Set<CharacterSheetBasicSkillsDevelopmentRight> developmentRightSet = new HashSet<>();
        characterSheetSkillsBasicDto.developmentValuesRight().forEach(s -> {
            CharacterSheetBasicSkillsDevelopmentRight developmentRight = new CharacterSheetBasicSkillsDevelopmentRight();
            developmentRight.setValue(s);
            developmentRightSet.add(developmentRight);
        });
        CharacterSheetBasicSkills basicSkills = new CharacterSheetBasicSkills();
        basicSkills.setDevelopmentValuesLeft(developmentLeftSet);
        basicSkills.setDevelopmentValuesRight(developmentRightSet);
        return basicSkills;
    }
    
    public CharacterSheetSkillsBasicDto mapSheetBasicSkillsToSheetBasicSkillsDto(CharacterSheetBasicSkills sheetBasicSkills) {
        Set<String> developmentsLeft = sheetBasicSkills.getDevelopmentValuesLeft().stream()
                                                       .map(CharacterSheetBasicSkillsDevelopmentLeft::getValue)
                                                       .collect(Collectors.toSet());
        Set<String> developmentsRight = sheetBasicSkills.getDevelopmentValuesRight().stream()
                                                        .map(CharacterSheetBasicSkillsDevelopmentRight::getValue)
                                                        .collect(Collectors.toSet());
        return new CharacterSheetSkillsBasicDto(developmentsLeft, developmentsRight);
    }
}
