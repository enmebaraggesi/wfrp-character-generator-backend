package com.warhammer.wfrp.armors;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArmorService {
    
    private final ArmorRepository repository;
    private final ArmorMapper mapper;
    
    public List<ArmorDto> getAllArmorsList() {
        List<Armor> armors = repository.findAll();
        return mapper.mapArmorListToArmorDtoList(armors);
    }
}
