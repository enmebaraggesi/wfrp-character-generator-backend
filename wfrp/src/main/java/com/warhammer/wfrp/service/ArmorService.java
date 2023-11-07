package com.warhammer.wfrp.service;

import com.warhammer.wfrp.dto.armor.ArmorDto;
import com.warhammer.wfrp.mapper.ArmorMapper;
import com.warhammer.wfrp.model.armor.Armor;
import com.warhammer.wfrp.repository.armor.ArmorRepository;
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
