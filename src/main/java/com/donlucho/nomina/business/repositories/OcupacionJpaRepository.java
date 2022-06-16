package com.donlucho.nomina.business.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.donlucho.nomina.business.entities.Ocupacion;

@Repository("ocupacionrepository")
public interface OcupacionJpaRepository extends JpaRepository<Ocupacion, Integer> {

}
