package com.warhammer.wfrp.repository;

import com.warhammer.wfrp.model.characters.CharacterSheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterSheetRepository extends JpaRepository<CharacterSheet, Integer> {
    
    CharacterSheet findByName(String name);
}
