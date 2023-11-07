package com.warhammer.wfrp.dto.character_sheet;

import java.util.Set;

public record SheetPointsDto(Set<String> heroPoints,
                             Set<String> destinyPoints,
                             String speedValue) {
    
}
