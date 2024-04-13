package com.warhammer.wfrp.eyes.repositories;

import com.warhammer.wfrp.eyes.models.HumanEyeColor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HumanEyeColorRepository extends JpaRepository<HumanEyeColor, Integer> {
    
}