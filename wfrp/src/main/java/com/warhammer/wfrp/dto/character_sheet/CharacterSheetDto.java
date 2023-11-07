package com.warhammer.wfrp.dto.character_sheet;

import java.util.Set;

public record CharacterSheetDto(String characterName,
                                String name,
                                String race,
                                String eyes,
                                String hair,
                                String profession,
                                String age,
                                String height,
                                SheetAttributesDto sheetAttributesDto,
                                SheetPointsDto sheetPointsDto,
                                SheetBasicSkillsDto sheetBasicSkillsDto,
                                SheetAdvancedSkillsDto sheetAdvancedSkillsDto,
                                SheetTalentsDto sheetTalentsDto,
                                SheetInventoryDto sheetInventoryDto,
                                Set<String> armorsNames,
                                Set<String> weaponsNames) {
    
}
