package com.warhammer.wfrp.weapons;

import com.warhammer.wfrp.weapons.ammo.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WeaponService {
    
    private final AmmoRepository ammoRepository;
    private final WeaponRepository weaponRepository;
    private final AmmoMapper ammoMapper;
    private final WeaponMapper weaponMapper;
    
    public List<AmmoDto> getAllAmmoList() {
        List<Ammo> ammo = ammoRepository.findAll();
        return ammoMapper.mapAmmoListToAmmoDtoList(ammo);
    }
    
    public List<WeaponDto> getAllWeaponsList() {
        List<Weapon> weapons = weaponRepository.findAll();
        return weaponMapper.mapWeaponListToWeaponDtoList(weapons);
    }
}
