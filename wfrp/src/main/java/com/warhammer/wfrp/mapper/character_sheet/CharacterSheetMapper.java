package com.warhammer.wfrp.mapper.character_sheet;

import com.warhammer.wfrp.dto.character_sheet.*;
import com.warhammer.wfrp.model.character_sheet.CharacterSheet;
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
                                     sheetAttributesMapper.mapSheetAttributesToSheetAttributesDto(character.getSheetAttributes()),
                                     sheetPointsMapper.mapSheetPointsToSheetPointsDto(character.getSheetPoints()),
                                     sheetBasicSkillsMapper.mapSheetBasicSkillsToSheetBasicSkillsDto(character.getSheetBasicSkills()),
                                     sheetAdvancedSkillsMapper.mapSheetAdvancedSkillsToSheetAdvancedSkillsDto(character.getSheetAdvancedSkills()),
                                     sheetTalentsMapper.mapSheetTalentsToSheetTalentsDto(character.getSheetTalents()),
                                     sheetInventoryMapper.mapSheetInventoryToSheetInventoryDto(character.getSheetInventory()),
                                     armorsNamesMapper.mapArmorsNamesToArmorsNamesDto(character.getArmorsNames()),
                                     weaponsNamesMapper.mapWeaponsNamesToWeaponsNamesDto(character.getWeaponsNames()));
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
                                  sheetAttributesMapper.mapSheetAttributesDtoToSheetAttributes(character.sheetAttributesDto()),
                                  sheetPointsMapper.mapSheetPointsDtoToSheetPoints(character.sheetPointsDto()),
                                  sheetBasicSkillsMapper.mapSheetBasicSkillsDtoToSheetBasicSkills(character.sheetBasicSkillsDto()),
                                  sheetAdvancedSkillsMapper.mapSheetAdvancedSkillsDtoToSheetAdvancedSkills(character.sheetAdvancedSkillsDto()),
                                  sheetTalentsMapper.mapSheetTalentsDtoToSheetTalents(character.sheetTalentsDto()),
                                  sheetInventoryMapper.mapSheetInventoryDtoToSheetInventory(character.sheetInventoryDto()),
                                  armorsNamesMapper.mapArmorsNamesDtoToArmorsNames(character.armorsNames()),
                                  weaponsNamesMapper.mapWeaponsNamesDtoToWeaponsNames(character.weaponsNames()));
    }
    
    public SheetNamesDto mapCharacterSheetListToSheetNamesDtoList(List<CharacterSheet> list) {
        List<String> sheetNames = list.stream()
                                      .map(CharacterSheet::getCharacterName)
                                      .toList();
        return new SheetNamesDto(sheetNames);
    }
    
    public CharacterReceivedDto mapCharacterSheetToCharacterReceivedDto(CharacterSheet character,
                                                                        HttpStatus httpStatus) {
        return new CharacterReceivedDto(character.getName(), httpStatus);
    }
    
    public CharacterDeletedDto mapCharacterNameToCharacterDeletedDto(String name, HttpStatus httpStatus) {
        return new CharacterDeletedDto(name, httpStatus);
    }
    
}
