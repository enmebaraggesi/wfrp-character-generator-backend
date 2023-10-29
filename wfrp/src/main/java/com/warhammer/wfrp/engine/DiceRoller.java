package com.warhammer.wfrp.engine;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DiceRoller {
    
    private final Random roller = new Random();
    
    public int flipACoin() {
        return roller.nextInt(2);
    }
    
    public int rollK10() {
        return roller.nextInt(1, 11);
    }
    
    public int roll2K10() {
        return rollK10() + rollK10();
    }
    
    public int rollK100() {
        return roller.nextInt(1, 101);
    }
}
