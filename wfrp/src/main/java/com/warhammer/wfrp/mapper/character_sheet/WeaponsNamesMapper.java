package com.warhammer.wfrp.mapper.character_sheet;

import com.warhammer.wfrp.model.character_sheet.WeaponsNames;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class WeaponsNamesMapper {
    
    public Set<WeaponsNames> mapWeaponsNamesDtoToWeaponsNames(Set<String> strings) {
        if (strings == null) {
            return null;
        }
        Set<WeaponsNames> weaponsNamesSet = new HashSet<>();
        strings.forEach(s -> {
            WeaponsNames weaponsNames = new WeaponsNames();
            weaponsNames.setValue(s);
            weaponsNamesSet.add(weaponsNames);
        });
        return weaponsNamesSet;
    }
    
    public Set<String> mapWeaponsNamesToWeaponsNamesDto(Set<WeaponsNames> weaponsNames) {
        return weaponsNames.stream()
                           .map(WeaponsNames::getValue)
                           .collect(Collectors.toSet());
    }
}
