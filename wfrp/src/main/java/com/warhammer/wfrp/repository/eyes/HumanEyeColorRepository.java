package com.warhammer.wfrp.repository.eyes;

import com.warhammer.wfrp.model.eyes.HumanEyeColor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HumanEyeColorRepository extends JpaRepository<HumanEyeColor, Integer> {
    
}