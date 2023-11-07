package com.warhammer.wfrp.service;

import com.warhammer.wfrp.dto.character_sheet.*;
import com.warhammer.wfrp.mapper.character_sheet.CharacterSheetMapper;
import com.warhammer.wfrp.model.character_sheet.CharacterSheet;
import com.warhammer.wfrp.repository.character_sheet.CharacterSheetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CharacterSheetService {
    
    private final CharacterSheetRepository repository;
    private final CharacterSheetMapper mapper;
    
    public SheetNamesDto getAllCharacterSheetsNamesList() {
        List<CharacterSheet> characterSheets = repository.findAll();
        return mapper.mapCharacterSheetListToSheetNamesDtoList(characterSheets);
    }
    
    public CharacterReceivedDto saveCharacterSheet(CharacterSheetDto character) {
        CharacterSheet characterSheet = mapper.mapCharacterSheetDtoToCharacterSheet(character);
        CharacterSheet saved = repository.save(characterSheet);
        return mapper.mapCharacterSheetToCharacterReceivedDto(saved, HttpStatus.ACCEPTED);
    }
    
    //TODO obsługa błędów
    public CharacterDeletedDto deleteCharacterSheetByName(String name) {
        CharacterSheet characterSheet = repository.findByName(name);
        repository.delete(characterSheet);
        return mapper.mapCharacterNameToCharacterDeletedDto(name, HttpStatus.OK);
    }
}
