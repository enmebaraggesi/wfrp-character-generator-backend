package com.warhammer.wfrp.character_sheets.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "character_sheet")
public class CharacterSheet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "character_name")
    private String characterName;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "race")
    private String race;
    
    @Column(name = "eyes")
    private String eyes;
    
    @Column(name = "hair")
    private String hair;
    
    @Column(name = "profession")
    private String profession;
    
    @Column(name = "age")
    private String age;
    
    @Column(name = "height")
    private String height;
    
    @ManyToOne
    @JoinColumn(name = "sheet_attributes_id")
    private CharacterSheetAttributes characterSheetAttributes;
    
    @ManyToOne
    @JoinColumn(name = "sheet_points_id")
    private CharacterSheetPoints characterSheetPoints;
    
    @ManyToOne
    @JoinColumn(name = "sheet_basic_skills_id")
    private CharacterSheetBasicSkills characterSheetBasicSkills;
    
    @ManyToOne
    @JoinColumn(name = "sheet_advanced_skills_id")
    private CharacterSheetAdvancedSkills characterSheetAdvancedSkills;
    
    @ManyToOne
    @JoinColumn(name = "sheet_talents_id")
    private CharacterSheetTalents characterSheetTalents;
    
    @ManyToOne
    @JoinColumn(name = "sheet_inventory_id")
    private CharacterSheetInventory characterSheetInventory;
    
    @OneToMany(mappedBy = "characterSheet", orphanRemoval = true)
    private Set<CharacterSheetArmors> characterSheetArmorsNames;
    
    @OneToMany(mappedBy = "characterSheet", orphanRemoval = true)
    private Set<CharacterSheetWeapons> characterSheetWeaponsNames;
    
    public CharacterSheet(String characterName, String name, String race, String eyes, String hair,
                          String profession, String age, String height, CharacterSheetAttributes characterSheetAttributes,
                          CharacterSheetPoints characterSheetPoints, CharacterSheetBasicSkills characterSheetBasicSkills,
                          CharacterSheetAdvancedSkills characterSheetAdvancedSkills, CharacterSheetTalents characterSheetTalents,
                          CharacterSheetInventory characterSheetInventory, Set<CharacterSheetArmors> characterSheetArmorsNames, Set<CharacterSheetWeapons> characterSheetWeaponsNames) {
        this.characterName = characterName;
        this.name = name;
        this.race = race;
        this.eyes = eyes;
        this.hair = hair;
        this.profession = profession;
        this.age = age;
        this.height = height;
        this.characterSheetAttributes = characterSheetAttributes;
        this.characterSheetPoints = characterSheetPoints;
        this.characterSheetBasicSkills = characterSheetBasicSkills;
        this.characterSheetAdvancedSkills = characterSheetAdvancedSkills;
        this.characterSheetTalents = characterSheetTalents;
        this.characterSheetInventory = characterSheetInventory;
        this.characterSheetArmorsNames = characterSheetArmorsNames;
        this.characterSheetWeaponsNames = characterSheetWeaponsNames;
    }
    
    
}