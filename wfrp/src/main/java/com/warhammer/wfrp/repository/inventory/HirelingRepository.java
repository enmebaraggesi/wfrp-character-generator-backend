package com.warhammer.wfrp.repository.inventory;

import com.warhammer.wfrp.model.inventory.Hireling;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HirelingRepository extends JpaRepository<Hireling, Integer> {

}