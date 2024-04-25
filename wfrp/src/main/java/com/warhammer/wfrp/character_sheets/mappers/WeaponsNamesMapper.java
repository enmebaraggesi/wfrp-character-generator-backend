package com.warhammer.wfrp.character_sheets.mappers;

import com.warhammer.wfrp.character_sheets.models.CharacterSheetWeapons;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class WeaponsNamesMapper {
    
    public Set<CharacterSheetWeapons> mapWeaponsNamesDtoToWeaponsNames(Set<String> input) {
        if (input == null) {
            return Collections.emptySet();
        }
        Set<CharacterSheetWeapons> weapons = new HashSet<>();
        input.forEach(s -> {
            CharacterSheetWeapons weaponsNames = new CharacterSheetWeapons();
            weaponsNames.setValue(s);
            weapons.add(weaponsNames);
        });
        return weapons;
    }
    
    public Set<String> mapWeaponsNamesToWeaponsNamesDto(Set<CharacterSheetWeapons> weapons) {
        return weapons.stream()
                      .map(CharacterSheetWeapons::getValue)
                      .collect(Collectors.toSet());
    }
}
