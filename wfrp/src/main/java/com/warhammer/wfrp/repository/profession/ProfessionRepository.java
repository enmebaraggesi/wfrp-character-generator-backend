package com.warhammer.wfrp.repository.profession;

import com.warhammer.wfrp.model.profession.Profession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessionRepository extends JpaRepository<Profession, Integer> {

}