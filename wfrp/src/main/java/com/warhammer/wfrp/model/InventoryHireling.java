package com.warhammer.wfrp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "INVENTORY_HIRELINGS")
public class InventoryHireling {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    
    @Column(name = "NAME", nullable = false, length = 50)
    private String name;
    
    @Column(name = "QUICK_JOB", nullable = false, length = 20)
    private String quickJob;
    
    @Column(name = "DAY_JOB", nullable = false, length = 10)
    private String dayJob;
    
    @Column(name = "WEEK_JOB", nullable = false, length = 25)
    private String weekJob;
    
    @Column(name = "ABOUT", nullable = false, length = 100)
    private String about;
    
}