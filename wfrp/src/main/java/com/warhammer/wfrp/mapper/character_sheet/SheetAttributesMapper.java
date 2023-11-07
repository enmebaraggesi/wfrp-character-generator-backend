package com.warhammer.wfrp.mapper.character_sheet;

import com.warhammer.wfrp.dto.character_sheet.SheetAttributesDto;
import com.warhammer.wfrp.model.character_sheet.*;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SheetAttributesMapper {
    
    public SheetAttributes mapSheetAttributesDtoToSheetAttributes(SheetAttributesDto sheetAttributesDto) {
        if (sheetAttributesDto == null) {
            return null;
        }
        Set<StartingValues> startingValuesSet = new HashSet<>();
        sheetAttributesDto.startingValues().forEach(s -> {
            StartingValues startingValues = new StartingValues();
            startingValues.setValue(s);
            startingValuesSet.add(startingValues);
        });
        Set<AttributesDevelopmentValues> attributesDevelopmentValuesSet = new HashSet<>();
        sheetAttributesDto.developmentValues().forEach(s -> {
            AttributesDevelopmentValues attributesDevelopmentValues = new AttributesDevelopmentValues();
            attributesDevelopmentValues.setValue(s);
            attributesDevelopmentValuesSet.add(attributesDevelopmentValues);
        });
        Set<FinalAttributesList> finalAttributesListSet = new HashSet<>();
        sheetAttributesDto.finalAttributesList().forEach(s -> {
            FinalAttributesList finalAttributesList = new FinalAttributesList();
            finalAttributesList.setValue(s);
            finalAttributesListSet.add(finalAttributesList);
        });
        SheetAttributes sheetAttributes = new SheetAttributes();
        sheetAttributes.setStartingValues(startingValuesSet);
        sheetAttributes.setDevelopmentValues(attributesDevelopmentValuesSet);
        sheetAttributes.setFinalAttributesList(finalAttributesListSet);
        return sheetAttributes;
    }
    
    public SheetAttributesDto mapSheetAttributesToSheetAttributesDto(SheetAttributes sheetAttributes) {
        Set<String> startingValues = sheetAttributes.getStartingValues().stream()
                                                    .map(StartingValues::getValue)
                                                    .collect(Collectors.toSet());
        Set<String> developmentValues = sheetAttributes.getDevelopmentValues().stream()
                                                       .map(AttributesDevelopmentValues::getValue)
                                                       .collect(Collectors.toSet());
        Set<String> finalValues = sheetAttributes.getFinalAttributesList().stream()
                                                 .map(FinalAttributesList::getValue)
                                                 .collect(Collectors.toSet());
        return new SheetAttributesDto(startingValues, developmentValues, finalValues);
    }
}
