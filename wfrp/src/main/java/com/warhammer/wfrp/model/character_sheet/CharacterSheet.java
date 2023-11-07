package com.warhammer.wfrp.model.character_sheet;

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
    private SheetAttributes sheetAttributes;
    
    @ManyToOne
    @JoinColumn(name = "sheet_points_id")
    private SheetPoints sheetPoints;
    
    @ManyToOne
    @JoinColumn(name = "sheet_basic_skills_id")
    private SheetBasicSkills sheetBasicSkills;
    
    @ManyToOne
    @JoinColumn(name = "sheet_advanced_skills_id")
    private SheetAdvancedSkills sheetAdvancedSkills;
    
    @ManyToOne
    @JoinColumn(name = "sheet_talents_id")
    private SheetTalents sheetTalents;
    
    @ManyToOne
    @JoinColumn(name = "sheet_inventory_id")
    private SheetInventory sheetInventory;
    
    @OneToMany(mappedBy = "characterSheet", orphanRemoval = true)
    private Set<ArmorsNames> armorsNames;
    
    @OneToMany(mappedBy = "characterSheet", orphanRemoval = true)
    private Set<WeaponsNames> weaponsNames;
    
    public CharacterSheet(String characterName, String name, String race, String eyes, String hair,
                          String profession, String age, String height, SheetAttributes sheetAttributes,
                          SheetPoints sheetPoints, SheetBasicSkills sheetBasicSkills,
                          SheetAdvancedSkills sheetAdvancedSkills, SheetTalents sheetTalents,
                          SheetInventory sheetInventory, Set<ArmorsNames> armorsNames, Set<WeaponsNames> weaponsNames) {
        this.characterName = characterName;
        this.name = name;
        this.race = race;
        this.eyes = eyes;
        this.hair = hair;
        this.profession = profession;
        this.age = age;
        this.height = height;
        this.sheetAttributes = sheetAttributes;
        this.sheetPoints = sheetPoints;
        this.sheetBasicSkills = sheetBasicSkills;
        this.sheetAdvancedSkills = sheetAdvancedSkills;
        this.sheetTalents = sheetTalents;
        this.sheetInventory = sheetInventory;
        this.armorsNames = armorsNames;
        this.weaponsNames = weaponsNames;
    }
    
    
}