package com.warhammer.wfrp.repository.inventory;

import com.warhammer.wfrp.model.inventory.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

}