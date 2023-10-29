package com.warhammer.wfrp.engine;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SkillsGenerator {
    
    public Set<String> generateSkillsBasedOnRace(String race) {
        switch (race) {
            case "Człowiek" -> {
                return generateHumanSkills();
            }
            case "Niziołek" -> {
                return generateHalflingSkills();
            }
            case "Krasnolud" -> {
                return generateDwarfSkills();
            }
            case "Wysoki elf" -> {
                return generateHighElfSkills();
            }
            case "Leśny elf" -> {
                return generateWoodElfSkills();
            }
            default -> {
                return null;
            }
        }
    }
    
    private Set<String> generateWoodElfSkills() {
        return Set.of("Atletyka", "Broń Biała (Podstawowa)", "Broń Zasięgowa (Łuk)", "Język (Eltharin)",
                      "Odporność", "Percepcja", "Skradanie (Dowolne)", "Sztuka Przetrwania", "Tropienie", "Wspinaczka",
                      "Występy (Śpiewanie)", "Zastraszanie");
    }
    
    private Set<String> generateHighElfSkills() {
        return Set.of("Broń Biała (Podstawowa)", "Broń Zasięgowa (Łuk)", "Dowodzenie", "Język (Eltharin)",
                      "Muzyka (Dowolny instrument)", "Nawigacja", "Opanowanie", "Pływanie", "Percepcja", "Wycena",
                      "Występy (Śpiewanie)", "Żeglarstwo");
    }
    
    private Set<String> generateDwarfSkills() {
        return Set.of("Broń Biała (Podstawowa)", "Język (Khazalid)", "Opanowanie", "Mocna Głowa",
                      "Rzemiosło (Dowolne)", "Wiedza (Geologia)", "Wiedza (Krasnoludy)", "Wiedza (Metalurgia)",
                      "Wycena", "Występy (Gawędziarstwo)", "Zastraszanie");
    }
    
    private Set<String> generateHumanSkills() {
        return Set.of("Broń Biała (Podstawowa)", "Broń Zasięgowa (Łuk)", "Charyzma", "Dowodzenie",
                      "Język (bretoński)", "Język (Jałowej Krainy)", "Opanowanie", "Opieka nad Zwierzętami",
                      "Plotkowanie", "Targowanie", "Wiedza (Reikland)", "Wycena");
    }
    
    private Set<String> generateHalflingSkills() {
        return Set.of("Charyzma", "Hazard", "Intuicja", "Język (Krainy Zgromadzenia)", "Mocna Głowa", "Percepcja",
                      "Rzemiosło (Kucharz)", "Skradanie (Dowolne)", "Targowanie", "Unik", "Wiedza (Reikland)",
                      "Zwinne Palce");
    }
}
