package com.warhammer.wfrp.mapper.character_sheet;

import com.warhammer.wfrp.dto.character_sheet.SheetPointsDto;
import com.warhammer.wfrp.model.character_sheet.*;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SheetPointsMapper {
    
    
    public SheetPoints mapSheetPointsDtoToSheetPoints(SheetPointsDto sheetPointsDto) {
        if (sheetPointsDto == null) {
            return null;
        }
        Set<HeroPoints> heroPointsSet = new HashSet<>();
        sheetPointsDto.heroPoints().forEach(s -> {
            HeroPoints heroPoints = new HeroPoints();
            heroPoints.setValue(s);
            heroPointsSet.add(heroPoints);
        });
        Set<DestinyPoints> destinyPointsSet = new HashSet<>();
        sheetPointsDto.destinyPoints().forEach(s -> {
            DestinyPoints destinyPoints = new DestinyPoints();
            destinyPoints.setValue(s);
            destinyPointsSet.add(destinyPoints);
        });
        SheetPoints sheetPoints = new SheetPoints();
        sheetPoints.setHeroPoints(heroPointsSet);
        sheetPoints.setDestinyPoints(destinyPointsSet);
        sheetPoints.setSpeedValue(sheetPointsDto.speedValue());
        return sheetPoints;
    }
    
    public SheetPointsDto mapSheetPointsToSheetPointsDto(SheetPoints sheetPoints) {
        Set<String> heroPoints = sheetPoints.getHeroPoints().stream()
                                            .map(HeroPoints::getValue)
                                            .collect(Collectors.toSet());
        Set<String> destinyPoints = sheetPoints.getDestinyPoints().stream()
                                               .map(DestinyPoints::getValue)
                                               .collect(Collectors.toSet());
        return new SheetPointsDto(heroPoints, destinyPoints, sheetPoints.getSpeedValue());
    }
}
