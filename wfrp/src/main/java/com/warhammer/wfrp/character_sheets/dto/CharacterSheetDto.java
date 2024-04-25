package com.warhammer.wfrp.character_sheets.dto;

import java.util.Set;

public record CharacterSheetDto(String characterName,
                                String name,
                                String race,
                                String eyes,
                                String hair,
                                String profession,
                                String age,
                                String height,
                                CharacterSheetAttributesDto characterSheetAttributesDto,
                                CharacterSheetPointsDto characterSheetPointsDto,
                                CharacterSheetSkillsBasicDto characterSheetSkillsBasicDto,
                                CharacterSheetSkillsAdvancedDto characterSheetSkillsAdvancedDto,
                                CharacterSheetTalentsDto characterSheetTalentsDto,
                                CharacterSheetInventoryDto characterSheetInventoryDto,
                                Set<String> armorsNames,
                                Set<String> weaponsNames) {
    
}
