package com.donlucho.nomina.business.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.donlucho.nomina.business.entities.Deduccion;

@Repository("deduccionrepository")
public interface DeduccionJpaRepository extends JpaRepository<Deduccion, Integer> {

}
