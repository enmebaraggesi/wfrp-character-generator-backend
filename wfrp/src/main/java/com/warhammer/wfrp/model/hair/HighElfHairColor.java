package com.warhammer.wfrp.model.hair;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "HIGH_ELF_HAIR_COLOR", schema = "warhammer")
public class HighElfHairColor implements HairColorsInterface {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COLOR_ID", nullable = false)
    private HairColor colorId;
    
}