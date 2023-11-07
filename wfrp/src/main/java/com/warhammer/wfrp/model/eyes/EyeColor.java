package com.warhammer.wfrp.model.eyes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "EYE_COLORS")
public class EyeColor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    
    @Column(name = "COLOR", nullable = false, length = 25)
    private String color;
    
    @OneToMany(mappedBy = "colorId")
    private Set<DwarfEyeColor> dwarfEyeColors = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "colorId")
    private Set<HalflingEyeColor> halflingEyeColors = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "colorId")
    private Set<HighElfEyeColor> highElfEyeColors = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "colorId")
    private Set<HumanEyeColor> humanEyeColors = new LinkedHashSet<>();
    
    @OneToMany(mappedBy = "colorId")
    private Set<WoodElfEyeColor> woodElfEyeColors = new LinkedHashSet<>();
    
}