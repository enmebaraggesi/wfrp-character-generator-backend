package com.warhammer.wfrp.character_sheets.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "sheet_inventory")
public class CharacterSheetInventory {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @OneToMany(mappedBy = "characterSheetInventory", orphanRemoval = true)
    private Set<CharacterSheetInventoryEquipment> characterSheetInventoryEquipment = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "characterSheetInventory", orphanRemoval = true)
    private Set<CharacterSheetInventoryHirelings> characterSheetInventoryHirelings = new LinkedHashSet<>();
    
}