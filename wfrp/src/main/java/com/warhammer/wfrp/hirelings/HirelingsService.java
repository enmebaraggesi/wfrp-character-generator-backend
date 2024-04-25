package com.warhammer.wfrp.hirelings;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HirelingsService {
    
    private final HirelingsRepository hirelingsRepository;
    private final HirelingsMapper hirelingsMapper;
    
    public List<HirelingsDto> getAllHirelingsList() {
        List<Hirelings> hirelings = hirelingsRepository.findAll();
        return hirelingsMapper.mapHirelingListToHirelingDtoList(hirelings);
    }
}
