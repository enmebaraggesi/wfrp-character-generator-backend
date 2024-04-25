package com.warhammer.wfrp.character_sheets.mappers;

import com.warhammer.wfrp.character_sheets.dto.CharacterSheetInventoryDto;
import com.warhammer.wfrp.character_sheets.models.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SheetInventoryMapper {
    
    public CharacterSheetInventory mapSheetInventoryDtoToSheetInventory(CharacterSheetInventoryDto characterSheetInventoryDto) {
        if (characterSheetInventoryDto == null) {
            return null;
        }
        Set<CharacterSheetInventoryEquipment> equipmentSet = new HashSet<>();
        characterSheetInventoryDto.equipmentNames().forEach(s -> {
            CharacterSheetInventoryEquipment equipment = new CharacterSheetInventoryEquipment();
            equipment.setValue(s);
            equipmentSet.add(equipment);
        });
        Set<CharacterSheetInventoryHirelings> hirelingsSet = new HashSet<>();
        characterSheetInventoryDto.hirelingsNames().forEach(s -> {
            CharacterSheetInventoryHirelings hirelings = new CharacterSheetInventoryHirelings();
            hirelings.setValue(s);
            hirelingsSet.add(hirelings);
        });
        CharacterSheetInventory inventory = new CharacterSheetInventory();
        inventory.setCharacterSheetInventoryEquipment(equipmentSet);
        inventory.setCharacterSheetInventoryHirelings(hirelingsSet);
        return inventory;
    }
    
    public CharacterSheetInventoryDto mapSheetInventoryToSheetInventoryDto(CharacterSheetInventory sheetInventory) {
        List<String> equipment = sheetInventory.getCharacterSheetInventoryEquipment().stream()
                                               .map(CharacterSheetInventoryEquipment::getValue)
                                               .toList();
        List<String> hireling = sheetInventory.getCharacterSheetInventoryHirelings().stream()
                                              .map(CharacterSheetInventoryHirelings::getValue)
                                              .toList();
        return new CharacterSheetInventoryDto(equipment, hireling);
    }
}
