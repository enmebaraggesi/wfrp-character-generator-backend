package com.warhammer.wfrp.skills;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillRepository extends JpaRepository<Skill, Integer> {
    
    List<Skill> findAllByIsAdvanced(Boolean isAdvanced);
}