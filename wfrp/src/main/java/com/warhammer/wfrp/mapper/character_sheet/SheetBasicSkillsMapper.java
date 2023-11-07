package com.warhammer.wfrp.mapper.character_sheet;

import com.warhammer.wfrp.dto.character_sheet.SheetBasicSkillsDto;
import com.warhammer.wfrp.model.character_sheet.*;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SheetBasicSkillsMapper {
    
    
    public SheetBasicSkills mapSheetBasicSkillsDtoToSheetBasicSkills(SheetBasicSkillsDto sheetBasicSkillsDto) {
        if (sheetBasicSkillsDto == null) {
            return null;
        }
        Set<BasicDevelopmentValuesLeft> developmentValuesLeftSet = new HashSet<>();
        sheetBasicSkillsDto.developmentValuesLeft().forEach(s -> {
            BasicDevelopmentValuesLeft developmentValuesLeft = new BasicDevelopmentValuesLeft();
            developmentValuesLeft.setValue(s);
            developmentValuesLeftSet.add(developmentValuesLeft);
        });
        Set<BasicDevelopmentValuesRight> developmentValuesRightSet = new HashSet<>();
        sheetBasicSkillsDto.developmentValuesRight().forEach(s -> {
            BasicDevelopmentValuesRight developmentValuesRight = new BasicDevelopmentValuesRight();
            developmentValuesRight.setValue(s);
            developmentValuesRightSet.add(developmentValuesRight);
        });
        SheetBasicSkills sheetBasicSkills = new SheetBasicSkills();
        sheetBasicSkills.setDevelopmentValuesLeft(developmentValuesLeftSet);
        sheetBasicSkills.setDevelopmentValuesRight(developmentValuesRightSet);
        return sheetBasicSkills;
    }
    
    public SheetBasicSkillsDto mapSheetBasicSkillsToSheetBasicSkillsDto(SheetBasicSkills sheetBasicSkills) {
        Set<String> developmentsLeft = sheetBasicSkills.getDevelopmentValuesLeft().stream()
                                                       .map(BasicDevelopmentValuesLeft::getValue)
                                                       .collect(Collectors.toSet());
        Set<String> developmentsRight = sheetBasicSkills.getDevelopmentValuesRight().stream()
                                                        .map(BasicDevelopmentValuesRight::getValue)
                                                        .collect(Collectors.toSet());
        return new SheetBasicSkillsDto(developmentsLeft, developmentsRight);
    }
}
