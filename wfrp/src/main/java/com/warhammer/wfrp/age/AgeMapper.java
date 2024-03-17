package com.warhammer.wfrp.age;

import org.springframework.stereotype.Service;

@Service
public class AgeMapper {
    
    public AgeDto mapAgeToAgeDto(Integer age) {
        return new AgeDto(age.toString());
    }
}
