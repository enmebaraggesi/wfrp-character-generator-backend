package com.warhammer.wfrp.character_sheets.dto;

import org.springframework.http.HttpStatus;

public record CharacterSheetReceivedDto(String name, HttpStatus status) {

}
