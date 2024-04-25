package com.warhammer.wfrp.character_sheets.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "advanced_skills_names")
public class CharacterSheetAdvancedSkillsNames {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "value", nullable = false)
    private String value;
    
    @ManyToOne
    @JoinColumn(name = "sheet_advanced_skills_id")
    private CharacterSheetAdvancedSkills characterSheetAdvancedSkills;
    
}