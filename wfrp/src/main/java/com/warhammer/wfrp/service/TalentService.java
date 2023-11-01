package com.warhammer.wfrp.service;

import com.warhammer.wfrp.dto.TalentDto;
import com.warhammer.wfrp.engine.DiceRoller;
import com.warhammer.wfrp.mapper.TalentMapper;
import com.warhammer.wfrp.model.talents.Talent;
import com.warhammer.wfrp.model.talents.TalentRoll;
import com.warhammer.wfrp.repository.talents.TalentRepository;
import com.warhammer.wfrp.repository.talents.TalentRollRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TalentService {
    
    private final DiceRoller diceRoller;
    private final TalentRepository talentRepository;
    private final TalentRollRepository rollRepository;
    private final TalentMapper mapper;
    
    public List<TalentDto> getAllTalents() {
        List<Talent> talentList = talentRepository.findAll();
        return mapper.mapTalentListToTalentDtoList(talentList);
    }
    
    public TalentDto getTalentByChance() {
        int result = diceRoller.rollK100();
        List<TalentRoll> talentRolls = rollRepository.findAll();
        for (TalentRoll talentRoll : talentRolls) {
            if (talentRoll.getRollMin() <= result && result <= talentRoll.getRollMax()) {
                return mapper.mapTalentToTalentDto(talentRoll.getTalent());
            }
        }
        return null;
    }
}
