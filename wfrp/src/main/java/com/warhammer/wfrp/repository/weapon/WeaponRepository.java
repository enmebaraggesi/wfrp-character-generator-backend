package com.warhammer.wfrp.repository.weapon;

import com.warhammer.wfrp.model.weapon.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeaponRepository extends JpaRepository<Weapon, Integer> {

}