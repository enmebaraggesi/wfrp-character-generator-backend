package com.warhammer.wfrp.hirelings;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HirelingsController {
    
    private final HirelingsService service;
    
    @GetMapping("/hirelings")
    public List<HirelingsDto> getAllHirelings() {
        return service.getAllHirelingsList();
    }
}
