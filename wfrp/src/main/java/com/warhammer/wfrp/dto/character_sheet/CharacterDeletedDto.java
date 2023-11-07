package com.warhammer.wfrp.dto.character_sheet;

import org.springframework.http.HttpStatus;

public record CharacterDeletedDto(String deleted, HttpStatus status) {

}
