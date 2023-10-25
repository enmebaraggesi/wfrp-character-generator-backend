package com.warhammer.wfrp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ELF_NAME_GENERATION")
public class ElfNameGeneration {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    
    @Column(name = "FIRST", nullable = false, length = 10)
    private String first;
    
    @Column(name = "SECOND", nullable = false, length = 10)
    private String second;
    
    @Column(name = "THIRD", nullable = false, length = 10)
    private String third;
    
    @Column(name = "FOURTH", nullable = false, length = 10)
    private String fourth;
    
}