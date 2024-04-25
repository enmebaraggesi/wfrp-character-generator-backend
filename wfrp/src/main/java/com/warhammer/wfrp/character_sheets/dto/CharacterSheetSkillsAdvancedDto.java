package com.warhammer.wfrp.character_sheets.dto;

import java.util.Set;

public record CharacterSheetSkillsAdvancedDto(Set<String> advancedSkillsNames,
                                              Set<String> developmentValues) {
    
}
