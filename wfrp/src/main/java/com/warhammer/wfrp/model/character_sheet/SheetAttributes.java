package com.warhammer.wfrp.model.character_sheet;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "sheet_attributes")
public class SheetAttributes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @OneToMany(mappedBy = "sheetAttributes", orphanRemoval = true)
    private Set<StartingValues> startingValues = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "sheetAttributes", orphanRemoval = true)
    private Set<AttributesDevelopmentValues> developmentValues = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "sheetAttributes", orphanRemoval = true)
    private Set<FinalAttributesList> finalAttributesList = new LinkedHashSet<>();
    
}