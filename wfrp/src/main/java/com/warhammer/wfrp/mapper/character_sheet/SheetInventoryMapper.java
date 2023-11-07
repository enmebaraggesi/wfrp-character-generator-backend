package com.warhammer.wfrp.mapper.character_sheet;

import com.warhammer.wfrp.dto.character_sheet.SheetInventoryDto;
import com.warhammer.wfrp.model.character_sheet.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SheetInventoryMapper {
    
    public SheetInventory mapSheetInventoryDtoToSheetInventory(SheetInventoryDto sheetInventoryDto) {
        if (sheetInventoryDto == null) {
            return null;
        }
        Set<EquipmentNames> equipmentNamesSet = new HashSet<>();
        sheetInventoryDto.equipmentNames().forEach(s -> {
            EquipmentNames equipmentNames = new EquipmentNames();
            equipmentNames.setValue(s);
            equipmentNamesSet.add(equipmentNames);
        });
        Set<HirelingsNames> hirelingsNamesSet = new HashSet<>();
        sheetInventoryDto.hirelingsNames().forEach(s -> {
            HirelingsNames hirelingsNames = new HirelingsNames();
            hirelingsNames.setValue(s);
            hirelingsNamesSet.add(hirelingsNames);
        });
        SheetInventory sheetInventory = new SheetInventory();
        sheetInventory.setEquipmentNames(equipmentNamesSet);
        sheetInventory.setHirelingsNames(hirelingsNamesSet);
        return sheetInventory;
    }
    
    public SheetInventoryDto mapSheetInventoryToSheetInventoryDto(SheetInventory sheetInventory) {
        List<String> equipmentNames = sheetInventory.getEquipmentNames().stream()
                                                    .map(EquipmentNames::getValue)
                                                    .toList();
        List<String> hirelingNames = sheetInventory.getHirelingsNames().stream()
                                                   .map(HirelingsNames::getValue)
                                                   .toList();
        return new SheetInventoryDto(equipmentNames, hirelingNames);
    }
}
