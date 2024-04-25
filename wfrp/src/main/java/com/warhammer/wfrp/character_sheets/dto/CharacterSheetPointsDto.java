package com.warhammer.wfrp.character_sheets.dto;

import java.util.Set;

public record CharacterSheetPointsDto(Set<String> heroPoints,
                                      Set<String> destinyPoints,
                                      String speedValue) {
    
}
