package com.warhammer.wfrp.mapper.character_sheet;

import com.warhammer.wfrp.dto.character_sheet.SheetAdvancedSkillsDto;
import com.warhammer.wfrp.model.character_sheet.*;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SheetAdvancedSkillsMapper {
    
    public SheetAdvancedSkills mapSheetAdvancedSkillsDtoToSheetAdvancedSkills(SheetAdvancedSkillsDto sheetAdvancedSkillsDto) {
        if (sheetAdvancedSkillsDto == null) {
            return null;
        }
        Set<AdvancedSkillsNames> advancedSkillsNamesSet = new HashSet<>();
        sheetAdvancedSkillsDto.advancedSkillsNames().forEach(s -> {
            AdvancedSkillsNames names = new AdvancedSkillsNames();
            names.setValue(s);
            advancedSkillsNamesSet.add(names);
        });
        Set<AdvancedDevelopmentValues> advancedDevelopmentValuesSet = new HashSet<>();
        sheetAdvancedSkillsDto.developmentValues().forEach(s -> {
            AdvancedDevelopmentValues values = new AdvancedDevelopmentValues();
            values.setValue(s);
            advancedDevelopmentValuesSet.add(values);
        });
        SheetAdvancedSkills sheetAdvancedSkills = new SheetAdvancedSkills();
        sheetAdvancedSkills.setAdvancedSkillsNames(advancedSkillsNamesSet);
        sheetAdvancedSkills.setDevelopmentValues(advancedDevelopmentValuesSet);
        return sheetAdvancedSkills;
    }
    
    public SheetAdvancedSkillsDto mapSheetAdvancedSkillsToSheetAdvancedSkillsDto(SheetAdvancedSkills sheetAdvancedSkills) {
        Set<String> advancedSkills = sheetAdvancedSkills.getAdvancedSkillsNames().stream()
                                                        .map(AdvancedSkillsNames::getValue)
                                                        .collect(Collectors.toSet());
        Set<String> advancedDevelopments = sheetAdvancedSkills.getDevelopmentValues().stream()
                                                              .map(AdvancedDevelopmentValues::getValue)
                                                              .collect(Collectors.toSet());
        return new SheetAdvancedSkillsDto(advancedSkills, advancedDevelopments);
    }
}
