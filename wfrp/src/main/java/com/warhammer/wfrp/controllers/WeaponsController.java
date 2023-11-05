package com.warhammer.wfrp.controllers;

import com.warhammer.wfrp.dto.AmmoDto;
import com.warhammer.wfrp.dto.WeaponDto;
import com.warhammer.wfrp.mapper.AmmunitionMapper;
import com.warhammer.wfrp.mapper.WeaponMapper;
import com.warhammer.wfrp.model.weapons.InventoryAmmo;
import com.warhammer.wfrp.model.weapons.InventoryWeapon;
import com.warhammer.wfrp.repository.weapons.InventoryAmmoRepository;
import com.warhammer.wfrp.repository.weapons.InventoryWeaponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class WeaponsController {
    
    private final InventoryAmmoRepository ammoRepository;
    private final InventoryWeaponRepository weaponRepository;
    private final AmmunitionMapper ammunitionMapper;
    private final WeaponMapper weaponMapper;
    
    @GetMapping("/ammo")
    public List<AmmoDto> getAllAmmo() {
        List<InventoryAmmo> inventoryAmmos = ammoRepository.findAll();
        return ammunitionMapper.mapInventoryAmmoListToAmmoDtoList(inventoryAmmos);
    }
    
    @GetMapping("/weapons")
    public List<WeaponDto> getAllWeapons() {
        List<InventoryWeapon> inventoryWeapons = weaponRepository.findAll();
        return weaponMapper.mapInventoryWeaponListToWeaponDtoList(inventoryWeapons);
    }
}
