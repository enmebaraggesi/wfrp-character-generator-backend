package com.warhammer.wfrp.service;

import com.warhammer.wfrp.dto.weapon.AmmoDto;
import com.warhammer.wfrp.dto.weapon.WeaponDto;
import com.warhammer.wfrp.mapper.AmmunitionMapper;
import com.warhammer.wfrp.mapper.WeaponMapper;
import com.warhammer.wfrp.model.weapon.Ammo;
import com.warhammer.wfrp.model.weapon.Weapon;
import com.warhammer.wfrp.repository.weapon.AmmoRepository;
import com.warhammer.wfrp.repository.weapon.WeaponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WeaponService {
    
    private final AmmoRepository ammoRepository;
    private final WeaponRepository weaponRepository;
    private final AmmunitionMapper ammunitionMapper;
    private final WeaponMapper weaponMapper;
    
    public List<AmmoDto> getAllAmmoList() {
        List<Ammo> ammo = ammoRepository.findAll();
        return ammunitionMapper.mapAmmoListToAmmoDtoList(ammo);
    }
    
    public List<WeaponDto> getAllWeaponsList() {
        List<Weapon> weapons = weaponRepository.findAll();
        return weaponMapper.mapWeaponListToWeaponDtoList(weapons);
    }
}
