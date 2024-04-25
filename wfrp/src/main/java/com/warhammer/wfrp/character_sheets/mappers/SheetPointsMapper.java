package com.warhammer.wfrp.character_sheets.mappers;

import com.warhammer.wfrp.character_sheets.dto.CharacterSheetPointsDto;
import com.warhammer.wfrp.character_sheets.models.*;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SheetPointsMapper {
    
    
    public CharacterSheetPoints mapSheetPointsDtoToSheetPoints(CharacterSheetPointsDto characterSheetPointsDto) {
        if (characterSheetPointsDto == null) {
            return null;
        }
        Set<CharacterSheetPointsHero> heroPointsSet = new HashSet<>();
        characterSheetPointsDto.heroPoints().forEach(s -> {
            CharacterSheetPointsHero heroPoints = new CharacterSheetPointsHero();
            heroPoints.setValue(s);
            heroPointsSet.add(heroPoints);
        });
        Set<CharacterSheetPointsDestiny> destinyPointsSet = new HashSet<>();
        characterSheetPointsDto.destinyPoints().forEach(s -> {
            CharacterSheetPointsDestiny destinyPoints = new CharacterSheetPointsDestiny();
            destinyPoints.setValue(s);
            destinyPointsSet.add(destinyPoints);
        });
        CharacterSheetPoints sheetPoints = new CharacterSheetPoints();
        sheetPoints.setCharacterSheetPointHeroes(heroPointsSet);
        sheetPoints.setCharacterSheetPointDestinies(destinyPointsSet);
        sheetPoints.setSpeedValue(characterSheetPointsDto.speedValue());
        return sheetPoints;
    }
    
    public CharacterSheetPointsDto mapSheetPointsToSheetPointsDto(CharacterSheetPoints sheetPoints) {
        Set<String> heroPoints = sheetPoints.getCharacterSheetPointHeroes().stream()
                                            .map(CharacterSheetPointsHero::getValue)
                                            .collect(Collectors.toSet());
        Set<String> destinyPoints = sheetPoints.getCharacterSheetPointDestinies().stream()
                                               .map(CharacterSheetPointsDestiny::getValue)
                                               .collect(Collectors.toSet());
        return new CharacterSheetPointsDto(heroPoints, destinyPoints, sheetPoints.getSpeedValue());
    }
}
