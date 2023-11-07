package com.warhammer.wfrp.model.character_sheet;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "sheet_inventory")
public class SheetInventory {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @OneToMany(mappedBy = "sheetInventory", orphanRemoval = true)
    private Set<EquipmentNames> equipmentNames = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "sheetInventory", orphanRemoval = true)
    private Set<HirelingsNames> hirelingsNames = new LinkedHashSet<>();
    
}