package com.warhammer.wfrp.eyes.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "HALFLING_EYE_COLOR")
public class HalflingEyeColor implements EyeColorInterface {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COLOR_ID", nullable = false)
    private EyeColor colorId;
    
}