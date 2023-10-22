package com.warhammer.wfrp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "HIGH_ELF_HAIR_COLOR")
public class HighElfHairColor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    
    @Column(name = "COLOR", nullable = false, length = 50)
    private String color;
    
}