package com.warhammer.wfrp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "RACES_ROLL")
public class RacesRoll {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    
    @Column(name = "NAME", nullable = false)
    private String name;
    
    @Column(name = "CHANCE_MIN", nullable = false)
    private Integer chanceMin;
    
    @Column(name = "CHANCE_MAX", nullable = false)
    private Integer chanceMax;
    
}