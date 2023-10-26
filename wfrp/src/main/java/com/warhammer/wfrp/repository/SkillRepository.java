package com.warhammer.wfrp.repository;

import com.warhammer.wfrp.model.skills.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillRepository extends JpaRepository<Skill, Integer> {
    
    List<Skill> findAllByIsAdvanced(Boolean isAdvanced);
}