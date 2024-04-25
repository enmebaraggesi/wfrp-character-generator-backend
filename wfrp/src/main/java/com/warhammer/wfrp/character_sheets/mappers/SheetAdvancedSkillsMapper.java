package com.warhammer.wfrp.character_sheets.mappers;

import com.warhammer.wfrp.character_sheets.dto.CharacterSheetSkillsAdvancedDto;
import com.warhammer.wfrp.character_sheets.models.*;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SheetAdvancedSkillsMapper {
    
    public CharacterSheetAdvancedSkills mapSheetAdvancedSkillsDtoToSheetAdvancedSkills(CharacterSheetSkillsAdvancedDto characterSheetSkillsAdvancedDto) {
        if (characterSheetSkillsAdvancedDto == null) {
            return null;
        }
        Set<CharacterSheetAdvancedSkillsNames> advancedSkillsNamesSet = new HashSet<>();
        characterSheetSkillsAdvancedDto.advancedSkillsNames().forEach(s -> {
            CharacterSheetAdvancedSkillsNames names = new CharacterSheetAdvancedSkillsNames();
            names.setValue(s);
            advancedSkillsNamesSet.add(names);
        });
        Set<CharacterSheetAdvancedSkillsDevelopment> advancedDevelopmentSet = new HashSet<>();
        characterSheetSkillsAdvancedDto.developmentValues().forEach(s -> {
            CharacterSheetAdvancedSkillsDevelopment values = new CharacterSheetAdvancedSkillsDevelopment();
            values.setValue(s);
            advancedDevelopmentSet.add(values);
        });
        CharacterSheetAdvancedSkills sheetAdvancedSkills = new CharacterSheetAdvancedSkills();
        sheetAdvancedSkills.setCharacterSheetAdvancedSkillsNames(advancedSkillsNamesSet);
        sheetAdvancedSkills.setDevelopmentValues(advancedDevelopmentSet);
        return sheetAdvancedSkills;
    }
    
    public CharacterSheetSkillsAdvancedDto mapSheetAdvancedSkillsToSheetAdvancedSkillsDto(CharacterSheetAdvancedSkills sheetAdvancedSkills) {
        Set<String> advancedSkills = sheetAdvancedSkills.getCharacterSheetAdvancedSkillsNames().stream()
                                                        .map(CharacterSheetAdvancedSkillsNames::getValue)
                                                        .collect(Collectors.toSet());
        Set<String> advancedDevelopments = sheetAdvancedSkills.getDevelopmentValues().stream()
                                                              .map(CharacterSheetAdvancedSkillsDevelopment::getValue)
                                                              .collect(Collectors.toSet());
        return new CharacterSheetSkillsAdvancedDto(advancedSkills, advancedDevelopments);
    }
}
