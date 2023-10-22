package com.warhammer.wfrp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "INVENTORY_DINING")
public class InventoryDining {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    
    @Column(name = "NAME", nullable = false, length = 50)
    private String name;
    
    @Column(name = "COST", nullable = false, length = 20)
    private String cost;
    
    @Column(name = "WEIGHT", length = 10)
    private String weight;
    
    @Column(name = "AVAILABILITY", nullable = false, length = 25)
    private String availability;
    
}