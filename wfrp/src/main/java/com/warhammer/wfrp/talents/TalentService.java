package com.warhammer.wfrp.talents;

import com.warhammer.wfrp.engine.DiceRoller;
import com.warhammer.wfrp.talents.roll.TalentRoll;
import com.warhammer.wfrp.talents.roll.TalentRollRepository;
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
