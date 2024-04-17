package com.warhammer.wfrp.hair.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "HAIR_COLORS")
public class HairColor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    
    @Column(name = "COLOR", nullable = false, length = 25)
    private String color;
    
    @OneToMany(mappedBy = "colorId")
    private Set<DwarfHairColor> dwarfHairColors = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "colorId")
    private Set<HalflingHairColor> halflingHairColors = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "colorId")
    private Set<HighElfHairColor> highElfHairColors = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "colorId")
    private Set<HumanHairColor> humanHairColors = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "colorId")
    private Set<WoodElfHairColor> woodElfHairColors = new LinkedHashSet<>();
}