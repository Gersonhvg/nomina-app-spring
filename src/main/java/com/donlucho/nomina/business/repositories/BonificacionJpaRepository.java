package com.donlucho.nomina.business.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.donlucho.nomina.business.entities.Bonificacion;

@Repository("bonificacionrepository")
public interface BonificacionJpaRepository extends JpaRepository<Bonificacion, Integer> {

}
