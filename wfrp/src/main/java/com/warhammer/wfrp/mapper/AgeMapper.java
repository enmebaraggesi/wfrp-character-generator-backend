package com.warhammer.wfrp.mapper;

import com.warhammer.wfrp.dto.AgeDto;
import org.springframework.stereotype.Service;

@Service
public class AgeMapper {
    
    public AgeDto mapAgeToAgeDto(Integer age) {
        return new AgeDto(age.toString());
    }
}
