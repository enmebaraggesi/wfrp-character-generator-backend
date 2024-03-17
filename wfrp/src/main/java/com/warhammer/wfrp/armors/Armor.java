package com.warhammer.wfrp.armors;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "INVENTORY_ARMOR")
public class Armor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    
    @Column(name = "TYPE", nullable = false, length = 25)
    private String type;
    
    @Column(name = "NAME", nullable = false, length = 50)
    private String name;
    
    @Column(name = "COST", nullable = false, length = 20)
    private String cost;
    
    @Column(name = "WEIGHT", length = 10)
    private String weight;
    
    @Column(name = "AVAILABILITY", nullable = false, length = 25)
    private String availability;
    
    @Column(name = "PENALTY", length = 25)
    private String penalty;
    
    @Column(name = "LOCALIZATION", nullable = false, length = 25)
    private String localization;
    
    @Column(name = "POINTS")
    private Integer points;
    
    @Column(name = "TRAITS", length = 50)
    private String traits;
    
}