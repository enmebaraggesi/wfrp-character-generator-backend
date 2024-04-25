package com.warhammer.wfrp.character_sheets.mappers;

import com.warhammer.wfrp.character_sheets.models.CharacterSheetArmors;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ArmorsNamesMapper {
    
    public Set<CharacterSheetArmors> mapArmorsNamesDtoToArmorsNames(Set<String> input) {
        if (input == null) {
            return Collections.emptySet();
        }
        Set<CharacterSheetArmors> armorsSet = new HashSet<>();
        input.forEach(s -> {
            CharacterSheetArmors armors = new CharacterSheetArmors();
            armors.setValue(s);
            armorsSet.add(armors);
        });
        return armorsSet;
    }
    
    public Set<String> mapArmorsNamesToArmorsNamesDto(Set<CharacterSheetArmors> input) {
        return input.stream()
                    .map(CharacterSheetArmors::getValue)
                    .collect(Collectors.toSet());
    }
}
