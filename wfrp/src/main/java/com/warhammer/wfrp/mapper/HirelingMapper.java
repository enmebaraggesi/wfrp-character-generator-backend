package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.HirelingDto;
import com.warhammer.wfrp.model.inventory.InventoryHireling;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HirelingMapper {
    
    private HirelingDto mapInventoryHirelingToHirelingDto(InventoryHireling inventoryHireling) {
        return new HirelingDto(inventoryHireling.getName(),
                               inventoryHireling.getQuickJob(),
                               inventoryHireling.getDayJob(),
                               inventoryHireling.getWeekJob(),
                               inventoryHireling.getAbout());
    }
    
    public List<HirelingDto> mapInventoryHirelingListToHirelingDtoList(List<InventoryHireling> list) {
        return list.stream()
                   .map(this::mapInventoryHirelingToHirelingDto)
                   .toList();
    }
}
