package com.warhammer.wfrp.inventory;

import com.warhammer.wfrp.dto.inventory.HirelingDto;
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
