package com.warhammer.wfrp.controller;

import com.warhammer.wfrp.dto.weapon.AmmoDto;
import com.warhammer.wfrp.dto.weapon.WeaponDto;
import com.warhammer.wfrp.service.WeaponService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class WeaponsController {
    
    private final WeaponService service;
    
    @GetMapping("/ammo")
    public List<AmmoDto> getAllAmmo() {
        return service.getAllAmmoList();
    }
    
    @GetMapping("/weapons")
    public List<WeaponDto> getAllWeapons() {
        return service.getAllWeaponsList();
    }
}
