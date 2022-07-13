package com.donlucho.nomina.business.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.donlucho.nomina.business.entities.Empleado;

@Repository("empleadorepository")
public interface EmpleadoJpaRepository extends JpaRepository<Empleado, Integer> {
	@Query("SELECT e FROM Empleado e WHERE "
			+ "CONCAT(e.id, e.dni, e.nombre, e.apellido, e.ocupacion.ocupacions) "
			+ "LIKE %?1%")
	public List<Empleado> findAll(String palabraClave);
}
