package com.warhammer.wfrp.character_sheets.dto;

import java.util.Set;

public record CharacterSheetAttributesDto(Set<String> startingValues,
                                          Set<String> developmentValues,
                                          Set<String> finalAttributesList) {
    
}
