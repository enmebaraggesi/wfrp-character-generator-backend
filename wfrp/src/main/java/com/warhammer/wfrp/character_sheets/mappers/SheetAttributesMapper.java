package com.warhammer.wfrp.character_sheets.mappers;

import com.warhammer.wfrp.character_sheets.dto.CharacterSheetAttributesDto;
import com.warhammer.wfrp.character_sheets.models.*;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SheetAttributesMapper {
    
    public CharacterSheetAttributes mapSheetAttributesDtoToSheetAttributes(CharacterSheetAttributesDto characterSheetAttributesDto) {
        if (characterSheetAttributesDto == null) {
            return null;
        }
        Set<CharacterSheetAttributesStarting> startingValuesSet = new HashSet<>();
        characterSheetAttributesDto.startingValues().forEach(s -> {
            CharacterSheetAttributesStarting startingValues = new CharacterSheetAttributesStarting();
            startingValues.setValue(s);
            startingValuesSet.add(startingValues);
        });
        Set<CharacterSheetAttributesDevelopment> attributesDevelopmentSet = new HashSet<>();
        characterSheetAttributesDto.developmentValues().forEach(s -> {
            CharacterSheetAttributesDevelopment attributesDevelopment = new CharacterSheetAttributesDevelopment();
            attributesDevelopment.setValue(s);
            attributesDevelopmentSet.add(attributesDevelopment);
        });
        Set<CharacterSheetAttributesFinal> finalAttributesSet = new HashSet<>();
        characterSheetAttributesDto.finalAttributesList().forEach(s -> {
            CharacterSheetAttributesFinal finalAttributesList = new CharacterSheetAttributesFinal();
            finalAttributesList.setValue(s);
            finalAttributesSet.add(finalAttributesList);
        });
        CharacterSheetAttributes sheetAttributes = new CharacterSheetAttributes();
        sheetAttributes.setCharacterSheetAttributesStartingValues(startingValuesSet);
        sheetAttributes.setDevelopmentValues(attributesDevelopmentSet);
        sheetAttributes.setCharacterSheetAttributeFinals(finalAttributesSet);
        return sheetAttributes;
    }
    
    public CharacterSheetAttributesDto mapSheetAttributesToSheetAttributesDto(CharacterSheetAttributes sheetAttributes) {
        Set<String> startingValues = sheetAttributes.getCharacterSheetAttributesStartingValues().stream()
                                                    .map(CharacterSheetAttributesStarting::getValue)
                                                    .collect(Collectors.toSet());
        Set<String> developmentValues = sheetAttributes.getDevelopmentValues().stream()
                                                       .map(CharacterSheetAttributesDevelopment::getValue)
                                                       .collect(Collectors.toSet());
        Set<String> finalValues = sheetAttributes.getCharacterSheetAttributeFinals().stream()
                                                 .map(CharacterSheetAttributesFinal::getValue)
                                                 .collect(Collectors.toSet());
        return new CharacterSheetAttributesDto(startingValues, developmentValues, finalValues);
    }
}
