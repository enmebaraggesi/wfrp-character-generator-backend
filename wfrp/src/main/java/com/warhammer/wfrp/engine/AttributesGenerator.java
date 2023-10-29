package com.warhammer.wfrp.engine;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AttributesGenerator {
    
    private final DiceRoller diceRoller;
    
    public int melee(String race) {
        switch (race) {
            case "Człowiek" -> {
                return diceRoller.roll2K10() + 20;
            }
            case "Krasnolud", "Wysoki elf", "Leśny elf" -> {
                return diceRoller.roll2K10() + 30;
            }
            case "Niziołek" -> {
                return diceRoller.roll2K10() + 10;
            }
            default -> {
                return 0;
            }
        }
    }
    
    public int distance(String race) {
        switch (race) {
            case "Człowiek", "Krasnolud" -> {
                return diceRoller.roll2K10() + 20;
            }
            case "Wysoki elf", "Leśny elf", "Niziołek" -> {
                return diceRoller.roll2K10() + 30;
            }
            default -> {
                return 0;
            }
        }
    }
    
    public int strength(String race) {
        switch (race) {
            case "Człowiek", "Krasnolud", "Wysoki elf", "Leśny elf" -> {
                return diceRoller.roll2K10() + 20;
            }
            case "Niziołek" -> {
                return diceRoller.roll2K10() + 10;
            }
            default -> {
                return 0;
            }
        }
    }
    
    public int endurance(String race) {
        switch (race) {
            case "Człowiek", "Wysoki elf", "Leśny elf", "Niziołek" -> {
                return diceRoller.roll2K10() + 20;
            }
            case "Krasnolud" -> {
                return diceRoller.roll2K10() + 30;
            }
            default -> {
                return 0;
            }
        }
    }
    
    public int initiative(String race) {
        switch (race) {
            case "Człowiek", "Krasnolud", "Niziołek" -> {
                return diceRoller.roll2K10() + 20;
            }
            case "Wysoki elf", "Leśny elf" -> {
                return diceRoller.roll2K10() + 40;
            }
            default -> {
                return 0;
            }
        }
    }
    
    public int agility(String race) {
        switch (race) {
            case "Człowiek", "Niziołek" -> {
                return diceRoller.roll2K10() + 20;
            }
            case "Wysoki elf", "Leśny elf" -> {
                return diceRoller.roll2K10() + 30;
            }
            case "Krasnolud" -> {
                return diceRoller.roll2K10() + 10;
            }
            default -> {
                return 0;
            }
        }
    }
    
    public int dexterity(String race) {
        switch (race) {
            case "Człowiek" -> {
                return diceRoller.roll2K10() + 20;
            }
            case "Niziołek", "Krasnolud", "Wysoki elf", "Leśny elf" -> {
                return diceRoller.roll2K10() + 30;
            }
            default -> {
                return 0;
            }
        }
    }
    
    public int intelligence(String race) {
        switch (race) {
            case "Człowiek", "Niziołek", "Krasnolud" -> {
                return diceRoller.roll2K10() + 20;
            }
            case "Wysoki elf", "Leśny elf" -> {
                return diceRoller.roll2K10() + 30;
            }
            default -> {
                return 0;
            }
        }
    }
    
    public int willpower(String race) {
        switch (race) {
            case "Człowiek" -> {
                return diceRoller.roll2K10() + 20;
            }
            case "Wysoki elf", "Leśny elf", "Niziołek" -> {
                return diceRoller.roll2K10() + 30;
            }
            case "Krasnolud" -> {
                return diceRoller.roll2K10() + 40;
            }
            default -> {
                return 0;
            }
        }
    }
    
    public int charisma(String race) {
        switch (race) {
            case "Człowiek", "Wysoki elf", "Leśny elf" -> {
                return diceRoller.roll2K10() + 20;
            }
            case "Niziołek" -> {
                return diceRoller.roll2K10() + 30;
            }
            case "Krasnolud" -> {
                return diceRoller.roll2K10() + 10;
            }
            default -> {
                return 0;
            }
        }
    }
    
    public int vitality(String race, int strengthBonus, int enduranceBonus, int willpowerBonus) {
        switch (race) {
            case "Człowiek", "Krasnolud", "Wysoki elf", "Leśny elf" -> {
                return strengthBonus + (2 * enduranceBonus) + willpowerBonus;
            }
            case "Niziołek" -> {
                return (2 * enduranceBonus) + willpowerBonus;
            }
            default -> {
                return 0;
            }
        }
    }
    
    public int destinyPoints(String race) {
        if (race.equals("Człowiek")) {
            return 2;
        } else return 0;
    }
    
    public int heroPoints(String race) {
        return switch (race) {
            case "Człowiek" -> 1;
            case "Krasnolud", "Niziołek" -> 2;
            default -> 0;
        };
    }
    
    public int bonusPoints(String race) {
        return switch (race) {
            case "Człowiek", "Niziołek" -> 3;
            case "Krasnolud", "Wysoki elf", "Leśny elf" -> 2;
            default -> 0;
        };
    }
    
    public int speed(String race) {
        return switch (race) {
            case "Człowiek" -> 4;
            case "Krasnolud", "Niziołek" -> 3;
            case "Wysoki elf", "Leśny elf" -> 5;
            default -> 0;
        };
    }
}
