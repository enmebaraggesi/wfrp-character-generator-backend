package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.inventory.HirelingDto;
import com.warhammer.wfrp.model.inventory.Hireling;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HirelingMapper {
    
    private HirelingDto mapHirelingToHirelingDto(Hireling hireling) {
        return new HirelingDto(hireling.getName(),
                               hireling.getQuickJob(),
                               hireling.getDayJob(),
                               hireling.getWeekJob(),
                               hireling.getAbout());
    }
    
    public List<HirelingDto> mapHirelingListToHirelingDtoList(List<Hireling> list) {
        return list.stream()
                   .map(this::mapHirelingToHirelingDto)
                   .toList();
    }
}
