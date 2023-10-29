package com.warhammer.wfrp.dto;

import java.util.Set;

public record CharacterSheetDto(String name,
                                String race,
                                Integer age,
                                Integer height,
                                String eyes,
                                String hair,
                                String className,
                                String profession,
                                String status,
                                String attributes,
                                Set<String> skillsNames,
                                Set<String> talentsNames,
                                Set<String> weaponsNames,
                                Set<String> ammoNames,
                                Set<String> armorsNames,
                                Set<String> inventory) {
    
}
