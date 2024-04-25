package com.warhammer.wfrp.character_sheets;

import com.warhammer.wfrp.character_sheets.models.CharacterSheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterSheetRepository extends JpaRepository<CharacterSheet, Integer> {
    
    CharacterSheet findByName(String name);
}