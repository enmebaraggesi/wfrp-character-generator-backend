package com.warhammer.wfrp.engine;

import com.warhammer.wfrp.service.TalentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TalentsGenerator {
    
    private final DiceRoller diceRoller;
    private final TalentService service;
    
    public List<String> generateTalentsBasedOnRace(String race) {
        switch (race) {
            case "Człowiek" -> {
                return generateHumanTalents();
            }
            case "Niziołek" -> {
                return generateHalflingTalents();
            }
            case "Krasnolud" -> {
                return generateDwarfTalents();
            }
            case "Wysoki elf" -> {
                return generateHighElfTalents();
            }
            case "Leśny elf" -> {
                return generateWoodElfTalents();
            }
            default -> {
                return null;
            }
        }
    }
    
    private List<String> generateWoodElfTalents() {
        List<String> talents = new ArrayList<>(List.of("Włóczykij", "Wyczulony Zmysł (Wzrok)", "Widzenie w Ciemności"));
        if (diceRoller.flipACoin() == 0) {
            talents.add("Czytanie/Pisanie");
        } else talents.add("Niezwykle Odporny");
        if (diceRoller.flipACoin() == 0) {
            talents.add("Twardziel");
        } else talents.add("Percepcja Magiczna");
        return talents;
    }
    
    private List<String> generateHighElfTalents() {
        List<String> talents = new ArrayList<>(List.of("Czytanie/Pisanie", "Wyczulony Zmysł (Wzrok)",
                                                       "Widzenie w Ciemności"));
        if (diceRoller.flipACoin() == 0) {
            talents.add("Błyskotliwość");
        } else talents.add("Zimna Krew");
        if (diceRoller.flipACoin() == 0) {
            talents.add("Szósty Zmysł");
        } else talents.add("Percepcja Magiczna");
        return talents;
    }
    
    private List<String> generateHalflingTalents() {
        List<String> talents = new ArrayList<>(List.of("Mały", "Odporność na Chaos",
                                                       "Widzenie w Ciemności", "Wyczulony Zmysł (Smak)"));
        talents.add(service.getTalentByChance().name());
        talents.add(service.getTalentByChance().name());
        return talents;
    }
    
    private List<String> generateDwarfTalents() {
        List<String> talents = new ArrayList<>(List.of("Odporny na Magię", "Tragarz", "Widzenie w Ciemności"));
        if (diceRoller.flipACoin() == 0) {
            talents.add("Czytanie/Pisanie");
        } else talents.add("Nieustępliwy");
        if (diceRoller.flipACoin() == 0) {
            talents.add("Odporność Psychiczna");
        } else talents.add("Nieugięty");
        return talents;
    }
    
    private List<String> generateHumanTalents() {
        List<String> talents = new ArrayList<>(List.of("Wróżba Losu"));
        if (diceRoller.flipACoin() == 0) {
            talents.add("Błyskotliwość");
        } else talents.add("Charyzmatyczny");
        talents.add(service.getTalentByChance().name());
        talents.add(service.getTalentByChance().name());
        talents.add(service.getTalentByChance().name());
        return talents;
    }
}
