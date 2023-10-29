package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.*;
import com.warhammer.wfrp.model.characters.CharacterSheet;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterSheetMapper {
    
    public CharacterSheetDto mapCharacterSheetToCharacterSheetDto(CharacterSheet characterSheet) {
        return new CharacterSheetDto(characterSheet.getName(),
                                     characterSheet.getRace(),
                                     characterSheet.getAge(),
                                     characterSheet.getHeight(),
                                     characterSheet.getEyes(),
                                     characterSheet.getHair(),
                                     characterSheet.getClassName(),
                                     characterSheet.getProfession(),
                                     characterSheet.getStatus(),
                                     characterSheet.getAttributes(),
                                     characterSheet.getSkillsNames(),
                                     characterSheet.getTalentsNames(),
                                     characterSheet.getWeaponsNames(),
                                     characterSheet.getAmmoNames(),
                                     characterSheet.getArmorsNames(),
                                     characterSheet.getInventory());
    }
    
    public List<CharacterSheetDto> mapCHaracterSheetListToCharacterSheetDtoList(List<CharacterSheet> list) {
        return list.stream()
                   .map(this::mapCharacterSheetToCharacterSheetDto)
                   .toList();
    }
    
    public CharacterReceivedDto mapCharacterSheetToCharacterReceivedDto(String name, HttpStatus httpStatus) {
        return new CharacterReceivedDto(name, httpStatus);
    }
    
    public CharacterDeletedDto mapCharacterNameToCharacterDeletedDto(String name, HttpStatus httpStatus) {
        return new CharacterDeletedDto(name, httpStatus);
    }
}
