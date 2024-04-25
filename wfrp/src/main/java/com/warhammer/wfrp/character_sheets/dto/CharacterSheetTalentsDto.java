package com.warhammer.wfrp.character_sheets.dto;

import java.util.List;

public record CharacterSheetTalentsDto(List<String> talentsNames,
                                       List<String> talentPoints) {
    
}
