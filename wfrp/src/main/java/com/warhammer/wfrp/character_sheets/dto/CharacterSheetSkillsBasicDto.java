package com.warhammer.wfrp.character_sheets.dto;

import java.util.Set;

public record CharacterSheetSkillsBasicDto(Set<String> developmentValuesLeft,
                                           Set<String> developmentValuesRight) {
    
}
