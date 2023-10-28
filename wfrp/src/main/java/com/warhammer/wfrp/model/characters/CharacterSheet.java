package com.warhammer.wfrp.model.characters;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "CHARACTER_SHEETS")
public class CharacterSheet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    
    @Column(name = "NAME", nullable = false)
    private String name;
    
    @Column(name = "RACE")
    private String race;
    
    @Column(name = "AGE")
    private Integer age;
    
    @Column(name = "HEIGHT")
    private Integer height;
    
    @Column(name = "EYES")
    private String eyes;
    
    @Column(name = "HAIR")
    private String hair;
    
    @Column(name = "CLASS")
    private String className;
    
    @Column(name = "PROFESSION")
    private String profession;
    
    @Column(name = "SOCIAL_STATUS")
    private String status;
    
    @Column(name = "ATTRIBUTES")
    private String attributes;
    
    @ElementCollection
    @CollectionTable(name = "CHARACTER_SKILLS", joinColumns = @JoinColumn(name = "CHARACTER_ID"))
    @Column(name = "SKILLS_NAMES")
    private Set<String> skillsNames = new HashSet<>();
    
    @ElementCollection
    @CollectionTable(name = "CHARACTER_TALENTS", joinColumns = @JoinColumn(name = "CHARACTER_ID"))
    @Column(name = "TALENTS_NAMES")
    private Set<String> talentsNames = new HashSet<>();
    
    @ElementCollection
    @CollectionTable(name = "CHARACTER_WEAPONS", joinColumns = @JoinColumn(name = "CHARACTER_ID"))
    @Column(name = "WEAPONS")
    private Set<String> weaponsNames = new HashSet<>();
    
    @ElementCollection
    @CollectionTable(name = "CHARACTER_AMMO", joinColumns = @JoinColumn(name = "CHARACTER_ID"))
    @Column(name = "AMMO")
    private Set<String> ammoNames = new HashSet<>();
    
    @ElementCollection
    @CollectionTable(name = "CHARACTER_ARMORS", joinColumns = @JoinColumn(name = "CHARACTER_ID"))
    @Column(name = "ARMORS")
    private Set<String> armorsNames = new HashSet<>();
    
    @ElementCollection
    @CollectionTable(name = "CHARACTER_INVENTORY", joinColumns = @JoinColumn(name = "CHARACTER_ID"))
    @Column(name = "INVENTORY")
    private Set<String> inventory = new HashSet<>();
}
