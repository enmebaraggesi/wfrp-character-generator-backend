package com.warhammer.wfrp.dto.character_sheet;

import org.springframework.http.HttpStatus;

public record CharacterReceivedDto(String name, HttpStatus status) {

}
