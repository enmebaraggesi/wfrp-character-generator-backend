package com.warhammer.wfrp.controller;

import com.warhammer.wfrp.dto.*;
import com.warhammer.wfrp.mapper.CharacterSheetMapper;
import com.warhammer.wfrp.model.characters.CharacterSheet;
import com.warhammer.wfrp.repository.CharacterSheetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CharacterSheetsController {
    
    private final CharacterSheetRepository repository;
    private final CharacterSheetMapper mapper;
    
    @GetMapping("/characters")
    public List<CharacterSheetDto> getAllCharacterSheets() {
        List<CharacterSheet> characterSheets = repository.findAll();
        return mapper.mapCHaracterSheetListToCharacterSheetDtoList(characterSheets);
    }
    
    @PostMapping("/characters")
    public CharacterReceivedDto saveNewCharacterSheet(@RequestBody CharacterSheetDto characterSheetDto) {
        CharacterSheet characterSheet = new CharacterSheet(99, characterSheetDto.name(), characterSheetDto.race(), characterSheetDto.age(),
                                                           characterSheetDto.height(), characterSheetDto.eyes(), characterSheetDto.hair(),
                                                           characterSheetDto.className(), characterSheetDto.profession(), characterSheetDto.status(),
                                                           characterSheetDto.attributes(), characterSheetDto.skillsNames(), characterSheetDto.talentsNames(),
                                                           characterSheetDto.weaponsNames(), characterSheetDto.ammoNames(), characterSheetDto.armorsNames(),
                                                           characterSheetDto.inventory());
        CharacterSheet saved = repository.save(characterSheet);
        return mapper.mapCharacterSheetToCharacterReceivedDto(saved.getName(), HttpStatus.ACCEPTED);
    }
    
    @DeleteMapping("/characters/{name}")
    public CharacterDeletedDto deleteCharacterByName(@PathVariable String name) {
        CharacterSheet characterSheet = repository.findByName(name);
        repository.delete(characterSheet);
        return mapper.mapCharacterNameToCharacterDeletedDto(name, HttpStatus.OK);
    }
}
