package com.warhammer.wfrp.character_sheets.mappers;

import com.warhammer.wfrp.character_sheets.dto.CharacterSheetTalentsDto;
import com.warhammer.wfrp.character_sheets.models.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SheetTalentsMapper {
    
    public CharacterSheetTalents mapSheetTalentsDtoToSheetTalents(CharacterSheetTalentsDto characterSheetTalentsDto) {
        if (characterSheetTalentsDto == null) {
            return null;
        }
        Set<CharacterSheetTalentsNames> talentsNamesSet = new HashSet<>();
        characterSheetTalentsDto.talentsNames().forEach(s -> {
            CharacterSheetTalentsNames talentsNames = new CharacterSheetTalentsNames();
            talentsNames.setValue(s);
            talentsNamesSet.add(talentsNames);
        });
        Set<CharacterSheetTalentsPoints> talentPointsSet = new HashSet<>();
        characterSheetTalentsDto.talentPoints().forEach(s -> {
            CharacterSheetTalentsPoints talentPoints = new CharacterSheetTalentsPoints();
            talentPoints.setValue(s);
            talentPointsSet.add(talentPoints);
        });
        CharacterSheetTalents talents = new CharacterSheetTalents();
        talents.setCharacterSheetTalentsNames(talentsNamesSet);
        talents.setCharacterSheetTalentsPoints(talentPointsSet);
        return talents;
    }
    
    public CharacterSheetTalentsDto mapSheetTalentsToSheetTalentsDto(CharacterSheetTalents sheetTalents) {
        List<String> talentNames = sheetTalents.getCharacterSheetTalentsNames().stream()
                                               .map(CharacterSheetTalentsNames::getValue)
                                               .toList();
        List<String> talentPoints = sheetTalents.getCharacterSheetTalentsPoints().stream()
                                                .map(CharacterSheetTalentsPoints::getValue)
                                                .toList();
        return new CharacterSheetTalentsDto(talentNames, talentPoints);
    }
}
