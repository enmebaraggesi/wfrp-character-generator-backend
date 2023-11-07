package com.warhammer.wfrp.dto.character_sheet;

import java.util.Set;

public record SheetAdvancedSkillsDto(Set<String> advancedSkillsNames,
                                     Set<String> developmentValues) {
    
}
