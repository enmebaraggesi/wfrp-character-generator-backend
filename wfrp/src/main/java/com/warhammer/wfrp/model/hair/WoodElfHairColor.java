package com.warhammer.wfrp.model.hair;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "WOOD_ELF_HAIR_COLOR")
public class WoodElfHairColor implements HairColor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    
    @Column(name = "COLOR", nullable = false, length = 25)
    private String color;
    
}