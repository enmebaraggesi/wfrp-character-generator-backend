package com.warhammer.wfrp.weapons;

import com.warhammer.wfrp.weapons.ammo.AmmoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class WeaponController {
    
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
