package com.donlucho.nomina.business.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.donlucho.nomina.business.entities.Deduccion;

@Repository("deduccionrepository")
public interface DeduccionJpaRepository extends JpaRepository<Deduccion, Integer> {
	@Query("SELECT d FROM Deduccion d WHERE "
			+ "CONCAT(d.id, d.motivo, d.monto, d.fecha, d.empleado.id, d.empleado.dni, d.empleado.nombre, d.empleado.apellido, d.empleado.ocupacion.ocupacions) "
			+ "LIKE %?1%")
	public List<Deduccion> findAll(String palabraClave);
}
