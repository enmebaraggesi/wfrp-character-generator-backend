package com.warhammer.wfrp.model.talent;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TALENTS")
public class Talent {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    
    @Column(name = "NAME", nullable = false)
    private String name;
    
    @Column(name = "MAX_VALUE")
    private Integer maxValue;
    
    @Column(name = "BONUS", length = 3)
    private String bonus;
    
    @Column(name = "TESTED")
    private String tested;
    
    @Lob
    @Column(name = "DESCRIPTION")
    private String description;
    
}