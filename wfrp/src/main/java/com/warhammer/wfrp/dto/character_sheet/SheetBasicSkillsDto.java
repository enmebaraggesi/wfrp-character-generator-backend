package com.warhammer.wfrp.dto.character_sheet;

import java.util.Set;

public record SheetBasicSkillsDto(Set<String> developmentValuesLeft,
                                  Set<String> developmentValuesRight) {
    
}
