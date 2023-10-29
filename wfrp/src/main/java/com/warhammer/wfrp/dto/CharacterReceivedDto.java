package com.warhammer.wfrp.dto;

import org.springframework.http.HttpStatus;

public record CharacterReceivedDto(String name, HttpStatus status) {

}
