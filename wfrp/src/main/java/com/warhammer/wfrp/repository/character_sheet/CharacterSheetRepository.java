package com.warhammer.wfrp.repository.character_sheet;

import com.warhammer.wfrp.model.character_sheet.CharacterSheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterSheetRepository extends JpaRepository<CharacterSheet, Integer> {
    
    CharacterSheet findByName(String name);
}