package com.warhammer.wfrp.engine;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DiceRoller {
    
    private final Random roller = new Random();
    
    public int flipACoin() {
        return roller.nextInt(2);
    }
    
    public int rollK10(int times) {
        int sum = 0;
        for (int i = 0; i < times; i++) {
            sum += roller.nextInt(1, 11);
        }
        return sum;
    }
    
    public int rollK20() {
        return roller.nextInt(1, 21);
    }
    
    public int rollK100() {
        return roller.nextInt(1, 101);
    }
}
