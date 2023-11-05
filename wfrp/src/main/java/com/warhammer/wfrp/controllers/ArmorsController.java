package com.warhammer.wfrp.controllers;

import com.warhammer.wfrp.dto.ArmorDto;
import com.warhammer.wfrp.mapper.ArmorMapper;
import com.warhammer.wfrp.model.armors.InventoryArmor;
import com.warhammer.wfrp.repository.armors.InventoryArmorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ArmorsController {
    
    private final InventoryArmorRepository repository;
    private final ArmorMapper mapper;
    
    @GetMapping("/armors")
    public List<ArmorDto> getAllArmors() {
        List<InventoryArmor> armors = repository.findAll();
        return mapper.mapInventoryArmorListToArmorDtoList(armors);
    }
}
