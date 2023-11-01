package com.warhammer.wfrp.engine;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AgeGenerator {
    
    private final DiceRoller diceRoller;
    
    public Integer generateAge(String race) {
        switch (race) {
            default -> {
                return 15 + diceRoller.rollK10(1);
            }
            case "dwarfs" -> {
                return 15 + diceRoller.rollK10(10);
            }
            case "halflings" -> {
                return 15 + diceRoller.rollK10(5);
            }
            case "helves", "velves" -> {
                return 30 + diceRoller.rollK10(10);
            }
        }
    }
}
