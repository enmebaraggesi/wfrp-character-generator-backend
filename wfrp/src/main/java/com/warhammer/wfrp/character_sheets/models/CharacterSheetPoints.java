package com.warhammer.wfrp.character_sheets.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "sheet_points")
public class CharacterSheetPoints {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @OneToMany(mappedBy = "characterSheetPoints", orphanRemoval = true)
    private Set<CharacterSheetPointsHero> characterSheetPointHeroes = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "characterSheetPoints", orphanRemoval = true)
    private Set<CharacterSheetPointsDestiny> characterSheetPointDestinies = new LinkedHashSet<>();
    
    @Column(name = "speed_value")
    private String speedValue;
    
}