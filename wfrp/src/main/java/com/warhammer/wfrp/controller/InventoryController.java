package com.warhammer.wfrp.controller;

import com.warhammer.wfrp.dto.inventory.HirelingDto;
import com.warhammer.wfrp.dto.inventory.InventoryDto;
import com.warhammer.wfrp.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class InventoryController {
    
    private final InventoryService service;
    
    @GetMapping("/inventory")
    public List<InventoryDto> getAllInventory() {
        return service.getAllInventoryList();
    }
    
    @GetMapping("/hirelings")
    public List<HirelingDto> getAllHirelings() {
        return service.getAllHirelingsList();
    }
}
