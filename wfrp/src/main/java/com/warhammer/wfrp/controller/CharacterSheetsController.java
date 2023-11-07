package com.warhammer.wfrp.controller;

import com.warhammer.wfrp.dto.character_sheet.*;
import com.warhammer.wfrp.service.CharacterSheetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("characters")
public class CharacterSheetsController {
    
    private final CharacterSheetService service;
    
    @GetMapping()
    public SheetNamesDto getAllCharacterSheetsNames() {
        return service.getAllCharacterSheetsNamesList();
    }
    
    @PostMapping()
    public CharacterReceivedDto saveNewCharacterSheet(@RequestBody CharacterSheetDto characterSheetDto) {
        return service.saveCharacterSheet(characterSheetDto);
    }
    
    @DeleteMapping("{name}")
    public CharacterDeletedDto deleteCharacterSheetByName(@PathVariable String name) {
        return service.deleteCharacterSheetByName(name);
    }
}

