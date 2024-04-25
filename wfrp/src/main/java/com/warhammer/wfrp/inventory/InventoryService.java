package com.warhammer.wfrp.inventory;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {
    
    private final InventoryRepository otherRepository;
    private final InventoryMapper inventoryMapper;
    
    public List<InventoryDto> getAllInventoryList() {
        List<Inventory> inventories = otherRepository.findAll();
        return inventoryMapper.mapInventoryListToInventoryDtoList(inventories);
    }
}
