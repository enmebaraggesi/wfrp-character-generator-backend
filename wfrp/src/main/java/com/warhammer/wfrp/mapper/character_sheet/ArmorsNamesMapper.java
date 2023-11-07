package com.warhammer.wfrp.mapper.character_sheet;

import com.warhammer.wfrp.model.character_sheet.ArmorsNames;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ArmorsNamesMapper {
    
    public Set<ArmorsNames> mapArmorsNamesDtoToArmorsNames(Set<String> strings) {
        if (strings == null) {
            return null;
        }
        Set<ArmorsNames> armorsNamesSet = new HashSet<>();
        strings.forEach(s -> {
            ArmorsNames armorsNames = new ArmorsNames();
            armorsNames.setValue(s);
            armorsNamesSet.add(armorsNames);
        });
        return armorsNamesSet;
    }
    
    public Set<String> mapArmorsNamesToArmorsNamesDto(Set<ArmorsNames> armorsNames) {
        return armorsNames.stream()
                          .map(ArmorsNames::getValue)
                          .collect(Collectors.toSet());
    }
}
