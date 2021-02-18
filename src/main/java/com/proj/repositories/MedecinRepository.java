package com.proj.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proj.entities.Medecin;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
	
	@Query("select m from Medecin m where m.cinMedecin like :x")
	public Medecin findByCin(@Param("x")String cinMedecin);

}
