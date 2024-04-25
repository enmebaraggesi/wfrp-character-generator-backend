package com.warhammer.wfrp.character_sheets.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "sheet_attributes")
public class CharacterSheetAttributes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @OneToMany(mappedBy = "characterSheetAttributes", orphanRemoval = true)
    private Set<CharacterSheetAttributesStarting> characterSheetAttributesStartingValues = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "characterSheetAttributes", orphanRemoval = true)
    private Set<CharacterSheetAttributesDevelopment> developmentValues = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "characterSheetAttributes", orphanRemoval = true)
    private Set<CharacterSheetAttributesFinal> characterSheetAttributeFinals = new LinkedHashSet<>();
    
}