package com.warhammer.wfrp.character_sheets.mappers;

import com.warhammer.wfrp.character_sheets.dto.*;
import com.warhammer.wfrp.character_sheets.models.CharacterSheet;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CharacterSheetMapper {
    
    private final SheetAttributesMapper sheetAttributesMapper;
    private final SheetPointsMapper sheetPointsMapper;
    private final SheetBasicSkillsMapper sheetBasicSkillsMapper;
    private final SheetAdvancedSkillsMapper sheetAdvancedSkillsMapper;
    private final SheetTalentsMapper sheetTalentsMapper;
    private final SheetInventoryMapper sheetInventoryMapper;
    private final ArmorsNamesMapper armorsNamesMapper;
    private final WeaponsNamesMapper weaponsNamesMapper;
    
    public CharacterSheetDto mapCharacterSheetToCharacterSheetDto(CharacterSheet character) {
        return new CharacterSheetDto(character.getCharacterName(),
                                     character.getName(),
                                     character.getRace(),
                                     character.getEyes(),
                                     character.getHair(),
                                     character.getProfession(),
                                     character.getAge(),
                                     character.getHeight(),
                                     sheetAttributesMapper.mapSheetAttributesToSheetAttributesDto(character.getCharacterSheetAttributes()),
                                     sheetPointsMapper.mapSheetPointsToSheetPointsDto(character.getCharacterSheetPoints()),
                                     sheetBasicSkillsMapper.mapSheetBasicSkillsToSheetBasicSkillsDto(character.getCharacterSheetBasicSkills()),
                                     sheetAdvancedSkillsMapper.mapSheetAdvancedSkillsToSheetAdvancedSkillsDto(character.getCharacterSheetAdvancedSkills()),
                                     sheetTalentsMapper.mapSheetTalentsToSheetTalentsDto(character.getCharacterSheetTalents()),
                                     sheetInventoryMapper.mapSheetInventoryToSheetInventoryDto(character.getCharacterSheetInventory()),
                                     armorsNamesMapper.mapArmorsNamesToArmorsNamesDto(character.getCharacterSheetArmorsNames()),
                                     weaponsNamesMapper.mapWeaponsNamesToWeaponsNamesDto(character.getCharacterSheetWeaponsNames()));
    }
    
    public CharacterSheet mapCharacterSheetDtoToCharacterSheet(CharacterSheetDto character) {
        return new CharacterSheet(character.characterName(),
                                  character.name(),
                                  character.race(),
                                  character.eyes(),
                                  character.hair(),
                                  character.profession(),
                                  character.age(),
                                  character.height(),
                                  sheetAttributesMapper.mapSheetAttributesDtoToSheetAttributes(character.characterSheetAttributesDto()),
                                  sheetPointsMapper.mapSheetPointsDtoToSheetPoints(character.characterSheetPointsDto()),
                                  sheetBasicSkillsMapper.mapSheetBasicSkillsDtoToSheetBasicSkills(character.characterSheetSkillsBasicDto()),
                                  sheetAdvancedSkillsMapper.mapSheetAdvancedSkillsDtoToSheetAdvancedSkills(character.characterSheetSkillsAdvancedDto()),
                                  sheetTalentsMapper.mapSheetTalentsDtoToSheetTalents(character.characterSheetTalentsDto()),
                                  sheetInventoryMapper.mapSheetInventoryDtoToSheetInventory(character.characterSheetInventoryDto()),
                                  armorsNamesMapper.mapArmorsNamesDtoToArmorsNames(character.armorsNames()),
                                  weaponsNamesMapper.mapWeaponsNamesDtoToWeaponsNames(character.weaponsNames()));
    }
    
    public CharacterSheetNamesDto mapCharacterSheetListToSheetNamesDtoList(List<CharacterSheet> list) {
        List<String> sheetNames = list.stream()
                                      .map(CharacterSheet::getCharacterName)
                                      .toList();
        return new CharacterSheetNamesDto(sheetNames);
    }
    
    public CharacterSheetReceivedDto mapCharacterSheetToCharacterReceivedDto(CharacterSheet character,
                                                                             HttpStatus httpStatus) {
        return new CharacterSheetReceivedDto(character.getName(), httpStatus);
    }
    
    public CharacterSheetDeletedDto mapCharacterNameToCharacterDeletedDto(String name, HttpStatus httpStatus) {
        return new CharacterSheetDeletedDto(name, httpStatus);
    }
    
}
