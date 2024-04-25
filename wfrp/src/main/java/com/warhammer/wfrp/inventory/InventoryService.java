package com.warhammer.wfrp.inventory;

import com.warhammer.wfrp.dto.inventory.HirelingDto;
import com.warhammer.wfrp.mapper.HirelingMapper;
import com.warhammer.wfrp.model.inventory.Hireling;
import com.warhammer.wfrp.repository.inventory.HirelingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {
    
    private final InventoryRepository otherRepository;
    private final HirelingRepository hirelingRepository;
    private final InventoryMapper inventoryMapper;
    private final HirelingMapper hirelingMapper;
    
    public List<InventoryDto> getAllInventoryList() {
        List<Inventory> inventories = otherRepository.findAll();
        return inventoryMapper.mapInventoryListToInventoryDtoList(inventories);
    }
    
    public List<HirelingDto> getAllHirelingsList() {
        List<Hireling> hirelings = hirelingRepository.findAll();
        return hirelingMapper.mapHirelingListToHirelingDtoList(hirelings);
    }
}
