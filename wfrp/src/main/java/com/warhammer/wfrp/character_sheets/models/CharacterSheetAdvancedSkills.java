package com.warhammer.wfrp.character_sheets.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "sheet_advanced_skills")
public class CharacterSheetAdvancedSkills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @OneToMany(mappedBy = "characterSheetAdvancedSkills", orphanRemoval = true)
    private Set<CharacterSheetAdvancedSkillsNames> characterSheetAdvancedSkillsNames = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "characterSheetAdvancedSkills", orphanRemoval = true)
    private Set<CharacterSheetAdvancedSkillsDevelopment> developmentValues = new LinkedHashSet<>();
    
}