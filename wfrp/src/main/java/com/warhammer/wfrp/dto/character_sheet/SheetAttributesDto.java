package com.warhammer.wfrp.dto.character_sheet;

import java.util.Set;

public record SheetAttributesDto(Set<String> startingValues,
                                 Set<String> developmentValues,
                                 Set<String> finalAttributesList) {
    
}
