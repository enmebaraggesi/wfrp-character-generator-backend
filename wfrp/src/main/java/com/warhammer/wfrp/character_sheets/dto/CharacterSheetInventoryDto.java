package com.warhammer.wfrp.character_sheets.dto;

import java.util.List;

public record CharacterSheetInventoryDto(List<String> equipmentNames,
                                         List<String> hirelingsNames) {
    
}
