package com.warhammer.wfrp.dto.character_sheet;

import java.util.List;

public record SheetInventoryDto(List<String> equipmentNames,
                                List<String> hirelingsNames) {
    
}
