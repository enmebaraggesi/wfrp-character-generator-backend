package com.warhammer.wfrp.engine;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HeightGenerator {
    
    private final DiceRoller diceRoller;
    
    public Integer generateHeight(String race) {
        switch (race) {
            default -> {
                return 150 + diceRoller.rollK10(4);
            }
            case "dwarfs" -> {
                return 130 + diceRoller.rollK10(2);
            }
            case "halflings" -> {
                return 95 + diceRoller.rollK10(2);
            }
            case "helves", "welves" -> {
                return 180 + diceRoller.rollK10(3);
            }
        }
    }
}
