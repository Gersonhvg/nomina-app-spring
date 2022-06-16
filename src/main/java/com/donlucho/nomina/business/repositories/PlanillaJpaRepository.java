package com.donlucho.nomina.business.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.donlucho.nomina.business.entities.Planilla;

@Repository("planillarepository")
public interface PlanillaJpaRepository extends JpaRepository<Planilla, Integer> {

}
