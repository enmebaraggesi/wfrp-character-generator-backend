package com.warhammer.wfrp.mapper.character_sheet;

import com.warhammer.wfrp.dto.character_sheet.SheetTalentsDto;
import com.warhammer.wfrp.model.character_sheet.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SheetTalentsMapper {
    
    public SheetTalents mapSheetTalentsDtoToSheetTalents(SheetTalentsDto sheetTalentsDto) {
        if (sheetTalentsDto == null) {
            return null;
        }
        Set<TalentsNames> talentsNamesSet = new HashSet<>();
        sheetTalentsDto.talentsNames().forEach(s -> {
            TalentsNames talentsNames = new TalentsNames();
            talentsNames.setValue(s);
            talentsNamesSet.add(talentsNames);
        });
        Set<TalentPoints> talentPointsSet = new HashSet<>();
        sheetTalentsDto.talentPoints().forEach(s -> {
            TalentPoints talentPoints = new TalentPoints();
            talentPoints.setValue(s);
            talentPointsSet.add(talentPoints);
        });
        SheetTalents sheetTalents = new SheetTalents();
        sheetTalents.setTalentsNames(talentsNamesSet);
        sheetTalents.setTalentPoints(talentPointsSet);
        return sheetTalents;
    }
    
    public SheetTalentsDto mapSheetTalentsToSheetTalentsDto(SheetTalents sheetTalents) {
        List<String> talentNames = sheetTalents.getTalentsNames().stream()
                                               .map(TalentsNames::getValue)
                                               .toList();
        List<String> talentPoints = sheetTalents.getTalentPoints().stream()
                                                .map(TalentPoints::getValue)
                                                .toList();
        return new SheetTalentsDto(talentNames, talentPoints);
    }
}
