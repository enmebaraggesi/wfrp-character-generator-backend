package com.warhammer.wfrp.skills;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "SKILLS")
public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    
    @Column(name = "NAME", nullable = false)
    private String name;
    
    @Column(name = "ATTRIBUTE", nullable = false, length = 3)
    private String attribute;
    
    @Column(name = "IS_ADVANCED", nullable = false)
    private Boolean isAdvanced = false;
    
    @Column(name = "IS_GROUP", nullable = false)
    private Boolean isGroup = false;
    
    @Lob
    @Column(name = "DESCRIPTION")
    private String description;
    
}