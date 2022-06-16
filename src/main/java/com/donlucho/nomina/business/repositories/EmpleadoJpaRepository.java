package com.donlucho.nomina.business.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.donlucho.nomina.business.entities.Empleado;

@Repository("empleadorepository")
public interface EmpleadoJpaRepository extends JpaRepository<Empleado, Integer> {
	
}