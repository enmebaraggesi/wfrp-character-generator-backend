package com.warhammer.wfrp.controller;

import com.warhammer.wfrp.dto.TalentDto;
import com.warhammer.wfrp.mapper.TalentMapper;
import com.warhammer.wfrp.model.talents.Talent;
import com.warhammer.wfrp.model.talents.TalentRoll;
import com.warhammer.wfrp.repository.talents.TalentRepository;
import com.warhammer.wfrp.repository.talents.TalentRollRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RequiredArgsConstructor
@RestController
public class TalentsController {
    
    private final TalentRepository talentRepository;
    private final TalentRollRepository rollRepository;
    private final TalentMapper mapper;
    
    @GetMapping("/talents")
    public List<TalentDto> getAllTalents() {
        List<Talent> talentList = talentRepository.findAll();
        return mapper.mapTalentListToTalentDtoList(talentList);
    }
    
    @GetMapping("/talents/random")
    public TalentDto getTalentByChance() {
        int result = new Random().nextInt(1, 100);
        List<TalentRoll> talentRolls = rollRepository.findAll();
        for (TalentRoll talentRoll : talentRolls) {
            if (talentRoll.getRollMin() <= result && result <= talentRoll.getRollMax()) {
                return mapper.mapTalentToTalentDto(talentRoll.getTalent());
            }
        }
        return null;
    }
}
