package com.warhammer.wfrp.character_sheets.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "hirelings_names")
public class CharacterSheetInventoryHirelings {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "value", nullable = false)
    private String value;
    
    @ManyToOne
    @JoinColumn(name = "sheet_inventory_id")
    private CharacterSheetInventory characterSheetInventory;
    
}