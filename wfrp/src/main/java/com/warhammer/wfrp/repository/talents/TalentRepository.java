package com.warhammer.wfrp.repository.talents;

import com.warhammer.wfrp.model.talents.Talent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TalentRepository extends JpaRepository<Talent, Integer> {

}