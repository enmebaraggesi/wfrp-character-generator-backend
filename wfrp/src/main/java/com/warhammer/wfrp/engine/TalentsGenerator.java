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
    
    //TODO generator, obsługa błędów
    public List<String> generateTalentsByRace(String race) {
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
        talents.add(diceRoller.flipACoin() == 0 ? "Czytanie/Pisanie" : "Niezwykle Odporny");
        talents.add(diceRoller.flipACoin() == 0 ? "Twardziel" : "Percepcja Magiczna");
        return talents;
    }
    
    private List<String> generateHighElfTalents() {
        List<String> talents = new ArrayList<>(List.of("Czytanie/Pisanie", "Wyczulony Zmysł (Wzrok)",
                                                       "Widzenie w Ciemności"));
        talents.add(diceRoller.flipACoin() == 0 ? "Błyskotliwość" : "Zimna Krew");
        talents.add(diceRoller.flipACoin() == 0 ? "Szósty Zmysł" : "Percepcja Magiczna");
        return talents;
    }
    
    private List<String> generateHalflingTalents() {
        List<String> talents = new ArrayList<>(List.of("Mały", "Odporność na Chaos",
                                                       "Widzenie w Ciemności", "Wyczulony Zmysł (Smak)"));
        talents.add(service.getRandomTalent().name());
        talents.add(service.getRandomTalent().name());
        return talents;
    }
    
    private List<String> generateDwarfTalents() {
        List<String> talents = new ArrayList<>(List.of("Odporny na Magię", "Tragarz", "Widzenie w Ciemności"));
        talents.add(diceRoller.flipACoin() == 0 ? "Czytanie/Pisanie" : "Nieustępliwy");
        talents.add(diceRoller.flipACoin() == 0 ? "Odporność Psychiczna" : "Nieugięty");
        return talents;
    }
    
    private List<String> generateHumanTalents() {
        List<String> talents = new ArrayList<>(List.of("Wróżba Losu"));
        talents.add(diceRoller.flipACoin() == 0 ? "Błyskotliwość" : "Charyzmatyczny");
        talents.add(service.getRandomTalent().name());
        talents.add(service.getRandomTalent().name());
        talents.add(service.getRandomTalent().name());
        return talents;
    }
}
