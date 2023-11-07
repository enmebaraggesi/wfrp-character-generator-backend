package com.warhammer.wfrp.model.character_sheet;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "sheet_advanced_skills")
public class SheetAdvancedSkills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @OneToMany(mappedBy = "sheetAdvancedSkills", orphanRemoval = true)
    private Set<AdvancedSkillsNames> advancedSkillsNames = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "sheetAdvancedSkills", orphanRemoval = true)
    private Set<AdvancedDevelopmentValues> developmentValues = new LinkedHashSet<>();
    
}