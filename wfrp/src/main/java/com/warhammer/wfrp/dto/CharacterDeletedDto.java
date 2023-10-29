package com.warhammer.wfrp.dto;

import org.springframework.http.HttpStatus;

public record CharacterDeletedDto(String deleted, HttpStatus status) {

}
