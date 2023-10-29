package com.warhammer.wfrp.controller;

import com.warhammer.wfrp.dto.HirelingDto;
import com.warhammer.wfrp.dto.InventoryDto;
import com.warhammer.wfrp.mapper.HirelingMapper;
import com.warhammer.wfrp.mapper.InventoryOtherMapper;
import com.warhammer.wfrp.model.inventory.InventoryHireling;
import com.warhammer.wfrp.model.inventory.InventoryOther;
import com.warhammer.wfrp.repository.inventory.InventoryHirelingRepository;
import com.warhammer.wfrp.repository.inventory.InventoryOtherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class InventoryController {
    
    private final InventoryOtherRepository otherRepository;
    private final InventoryHirelingRepository hirelingRepository;
    private final InventoryOtherMapper inventoryOtherMapper;
    private final HirelingMapper hirelingMapper;
    
    @GetMapping("/inventory")
    public List<InventoryDto> getAllInventory() {
        List<InventoryOther> inventoryOthers = otherRepository.findAll();
        return inventoryOtherMapper.mapInventoryOtherListToInventoryDtoList(inventoryOthers);
    }
    
    @GetMapping("/hirelings")
    public List<HirelingDto> getAllHirelings() {
        List<InventoryHireling> inventoryHirelings = hirelingRepository.findAll();
        return hirelingMapper.mapInventoryHirelingListToHirelingDtoList(inventoryHirelings);
    }
}
