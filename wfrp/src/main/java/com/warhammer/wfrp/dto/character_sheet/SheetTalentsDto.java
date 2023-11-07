package com.warhammer.wfrp.dto.character_sheet;

import java.util.List;

public record SheetTalentsDto(List<String> talentsNames,
                              List<String> talentPoints) {
    
}
