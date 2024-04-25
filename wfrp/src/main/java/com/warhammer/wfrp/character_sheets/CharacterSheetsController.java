package com.warhammer.wfrp.character_sheets;

import com.warhammer.wfrp.character_sheets.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("characters")
public class CharacterSheetsController {
    
    private final CharacterSheetService service;
    
    @GetMapping()
    public CharacterSheetNamesDto getAllCharacterSheetsNames() {
        return service.getAllCharacterSheetsNamesList();
    }
    
    @PostMapping()
    public CharacterSheetReceivedDto saveNewCharacterSheet(@RequestBody CharacterSheetDto characterSheetDto) {
        return service.saveCharacterSheet(characterSheetDto);
    }
    
    @DeleteMapping("{name}")
    public CharacterSheetDeletedDto deleteCharacterSheetByName(@PathVariable String name) {
        return service.deleteCharacterSheetByName(name);
    }
}

