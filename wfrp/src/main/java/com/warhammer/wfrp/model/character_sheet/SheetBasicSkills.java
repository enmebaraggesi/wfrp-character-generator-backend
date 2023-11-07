package com.warhammer.wfrp.model.character_sheet;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "sheet_basic_skills")
public class SheetBasicSkills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @OneToMany(mappedBy = "sheetBasicSkills", orphanRemoval = true)
    private Set<BasicDevelopmentValuesLeft> developmentValuesLeft = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "sheetBasicSkills", orphanRemoval = true)
    private Set<BasicDevelopmentValuesRight> developmentValuesRight = new LinkedHashSet<>();
    
}