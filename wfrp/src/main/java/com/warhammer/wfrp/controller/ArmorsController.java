package com.warhammer.wfrp.controller;

import com.warhammer.wfrp.dto.armor.ArmorDto;
import com.warhammer.wfrp.service.ArmorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("armors")
public class ArmorsController {
    
    private final ArmorService service;
    
    @GetMapping
    public List<ArmorDto> getAllArmors() {
        return service.getAllArmorsList();
    }
}
