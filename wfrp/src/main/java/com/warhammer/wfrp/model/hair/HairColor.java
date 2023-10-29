package com.warhammer.wfrp.model.hair;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    
    @Size(max = 25)
    @NotNull
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