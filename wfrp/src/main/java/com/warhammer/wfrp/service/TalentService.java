package com.warhammer.wfrp.service;

import com.warhammer.wfrp.dto.talent.TalentDto;
import com.warhammer.wfrp.engine.DiceRoller;
import com.warhammer.wfrp.mapper.TalentMapper;
import com.warhammer.wfrp.model.talent.Talent;
import com.warhammer.wfrp.model.talent.TalentRoll;
import com.warhammer.wfrp.repository.talent.TalentRepository;
import com.warhammer.wfrp.repository.talent.TalentRollRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TalentService {
    
    private final TalentRepository talentRepository;
    private final TalentRollRepository rollRepository;
    private final DiceRoller diceRoller;
    private final TalentMapper mapper;
    
    public List<TalentDto> getAllTalentsList() {
        List<Talent> talentList = talentRepository.findAll();
        return mapper.mapTalentListToTalentDtoList(talentList);
    }
    
    public TalentDto getRandomTalent() {
        int result = diceRoller.rollK100();
        List<TalentRoll> talentRolls = rollRepository.findAll();
        for (TalentRoll talentRoll : talentRolls) {
            if (isAvailableForResult(talentRoll, result)) {
                return mapper.mapTalentToTalentDto(talentRoll.getTalent());
            }
        }
        return null;
    }
    
    private static boolean isAvailableForResult(TalentRoll talentRoll, int result) {
        return talentRoll.getRollMin() <= result && result <= talentRoll.getRollMax();
    }
}
