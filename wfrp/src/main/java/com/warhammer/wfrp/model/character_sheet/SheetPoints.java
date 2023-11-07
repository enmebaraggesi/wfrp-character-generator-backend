package com.warhammer.wfrp.model.character_sheet;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "sheet_points")
public class SheetPoints {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @OneToMany(mappedBy = "sheetPoints", orphanRemoval = true)
    private Set<HeroPoints> heroPoints = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "sheetPoints", orphanRemoval = true)
    private Set<DestinyPoints> destinyPoints = new LinkedHashSet<>();
    
    @Column(name = "speed_value")
    private String speedValue;
    
}