package com.warhammer.wfrp.model.character_sheet;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "sheet_talents")
public class SheetTalents {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @OneToMany(mappedBy = "sheetTalents", orphanRemoval = true)
    private Set<TalentsNames> talentsNames = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "sheetTalents", orphanRemoval = true)
    private Set<TalentPoints> talentPoints = new LinkedHashSet<>();
    
}