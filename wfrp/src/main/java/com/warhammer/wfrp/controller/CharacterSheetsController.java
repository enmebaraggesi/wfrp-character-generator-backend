package com.warhammer.wfrp.controller;

import com.warhammer.wfrp.mapper.CharacterSheetMapper;
import com.warhammer.wfrp.repository.CharacterSheetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CharacterSheetsController {
    
    private final CharacterSheetRepository characterSheetRepository;
    private final CharacterSheetMapper characterSheetMapper;
}
