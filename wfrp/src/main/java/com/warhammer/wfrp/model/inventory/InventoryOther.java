package com.warhammer.wfrp.model.inventory;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "INVENTORY_OTHER")
public class InventoryOther {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    
    @Size(max = 25)
    @NotNull
    @Column(name = "TYPE", nullable = false, length = 25)
    private String type;
    
    @Size(max = 50)
    @NotNull
    @Column(name = "NAME", nullable = false, length = 50)
    private String name;
    
    @Size(max = 20)
    @NotNull
    @Column(name = "COST", nullable = false, length = 20)
    private String cost;
    
    @Size(max = 20)
    @Column(name = "WEIGHT", length = 20)
    private String weight;
    
    @Column(name = "CONTAINS")
    private Integer contains;
    
    @Size(max = 25)
    @NotNull
    @Column(name = "AVAILABILITY", nullable = false, length = 25)
    private String availability;
    
}