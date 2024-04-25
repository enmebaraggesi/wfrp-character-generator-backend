package com.warhammer.wfrp.character_sheets;

import com.warhammer.wfrp.character_sheets.dto.*;
import com.warhammer.wfrp.character_sheets.mappers.CharacterSheetMapper;
import com.warhammer.wfrp.character_sheets.models.CharacterSheet;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CharacterSheetService {
    
    private final CharacterSheetRepository repository;
    private final CharacterSheetMapper mapper;
    
    public CharacterSheetNamesDto getAllCharacterSheetsNamesList() {
        List<CharacterSheet> characterSheets = repository.findAll();
        return mapper.mapCharacterSheetListToSheetNamesDtoList(characterSheets);
    }
    
    public CharacterSheetReceivedDto saveCharacterSheet(CharacterSheetDto character) {
        CharacterSheet characterSheet = mapper.mapCharacterSheetDtoToCharacterSheet(character);
        CharacterSheet saved = repository.save(characterSheet);
        return mapper.mapCharacterSheetToCharacterReceivedDto(saved, HttpStatus.ACCEPTED);
    }
    
    //TODO obsługa błędów
    public CharacterSheetDeletedDto deleteCharacterSheetByName(String name) {
        CharacterSheet characterSheet = repository.findByName(name);
        repository.delete(characterSheet);
        return mapper.mapCharacterNameToCharacterDeletedDto(name, HttpStatus.OK);
    }
}
