package com.warhammer.wfrp.races;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "RACES_ROLL")
public class Race {
    
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