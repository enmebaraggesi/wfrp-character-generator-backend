package com.warhammer.wfrp.inventory;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "INVENTORY_OTHER")
public class Inventory {
    
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
    
    @Column(name = "WEIGHT", length = 20)
    private String weight;
    
    @Column(name = "CONTAINS")
    private Integer contains;
    
    @Column(name = "AVAILABILITY", nullable = false, length = 25)
    private String availability;
    
}