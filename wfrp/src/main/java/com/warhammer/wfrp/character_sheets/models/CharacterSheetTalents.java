package com.warhammer.wfrp.character_sheets.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "sheet_talents")
public class CharacterSheetTalents {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @OneToMany(mappedBy = "characterSheetTalents", orphanRemoval = true)
    private Set<CharacterSheetTalentsNames> characterSheetTalentsNames = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "characterSheetTalents", orphanRemoval = true)
    private Set<CharacterSheetTalentsPoints> characterSheetTalentsPoints = new LinkedHashSet<>();
    
}