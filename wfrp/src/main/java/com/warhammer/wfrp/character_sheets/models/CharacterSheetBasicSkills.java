package com.warhammer.wfrp.character_sheets.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "sheet_basic_skills")
public class CharacterSheetBasicSkills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @OneToMany(mappedBy = "characterSheetBasicSkills", orphanRemoval = true)
    private Set<CharacterSheetBasicSkillsDevelopmentLeft> developmentValuesLeft = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "characterSheetBasicSkills", orphanRemoval = true)
    private Set<CharacterSheetBasicSkillsDevelopmentRight> developmentValuesRight = new LinkedHashSet<>();
    
}