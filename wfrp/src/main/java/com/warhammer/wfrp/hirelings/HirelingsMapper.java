package com.warhammer.wfrp.hirelings;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HirelingsMapper {
    
    private HirelingsDto mapHirelingToHirelingDto(Hirelings hirelings) {
        return new HirelingsDto(hirelings.getName(),
                                hirelings.getQuickJob(),
                                hirelings.getDayJob(),
                                hirelings.getWeekJob(),
                                hirelings.getAbout());
    }
    
    public List<HirelingsDto> mapHirelingListToHirelingDtoList(List<Hirelings> list) {
        return list.stream()
                   .map(this::mapHirelingToHirelingDto)
                   .toList();
    }
}
