package com.warhammer.wfrp.model.professions;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PROFESSIONS_ROLL")
public class ProfessionsRoll {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    
    @Column(name = "CLASS", nullable = false)
    private String classField;
    
    @Column(name = "NAME", nullable = false)
    private String name;
    
    @Lob
    @Column(name = "DESCRIPTION")
    private String description;
    
    @Size(max = 10)
    @NotNull
    @Column(name = "STATUS", nullable = false, length = 10)
    private String status;
    
    @Column(name = "HU_MIN")
    private Integer huMin;
    
    @Column(name = "HU_MAX")
    private Integer huMax;
    
    @Column(name = "DW_MIN")
    private Integer dwMin;
    
    @Column(name = "DW_MAX")
    private Integer dwMax;
    
    @Column(name = "HAL_MIN")
    private Integer halMin;
    
    @Column(name = "HAL_MAX")
    private Integer halMax;
    
    @Column(name = "H_ELF_MIN")
    private Integer hElfMin;
    
    @Column(name = "H_ELF_MAX")
    private Integer hElfMax;
    
    @Column(name = "W_ELF_MIN")
    private Integer wElfMin;
    
    @Column(name = "W_ELF_MAX")
    private Integer wElfMax;
    
}