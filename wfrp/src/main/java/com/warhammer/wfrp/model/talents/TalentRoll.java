package com.warhammer.wfrp.model.talents;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TALENT_ROLL")
public class TalentRoll {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    
    @Column(name = "ROLL_MIN", nullable = false)
    private Integer rollMin;
    
    @Column(name = "ROLL_MAX", nullable = false)
    private Integer rollMax;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TALENT")
    private Talent talent;
    
}