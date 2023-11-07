package com.warhammer.wfrp.model.weapon;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "INVENTORY_AMMO")
public class Ammo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    
    @Column(name = "TYPE", nullable = false, length = 50)
    private String type;
    
    @Column(name = "NAME", nullable = false, length = 50)
    private String name;
    
    @Column(name = "COST", nullable = false, length = 20)
    private String cost;
    
    @Column(name = "AVAILABILITY", nullable = false, length = 25)
    private String availability;
    
    @Column(name = "LENGTH", nullable = false, length = 25)
    private String length;
    
    @Column(name = "DAMAGE", length = 10)
    private String damage;
    
    @Column(name = "TRAITS", length = 100)
    private String traits;
    
}