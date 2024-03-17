package com.warhammer.wfrp.armors;

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
