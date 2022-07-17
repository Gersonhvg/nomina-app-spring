package com.donlucho.nomina.business.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.donlucho.nomina.business.entities.Bonificacion;

@Repository("bonificacionrepository")
public interface BonificacionJpaRepository extends JpaRepository<Bonificacion, Integer> {
	@Query("SELECT b FROM Bonificacion b WHERE "
			+ "CONCAT(b.id, b.motivo, b.monto, b.fecha, b.empleado.id, b.empleado.dni, b.empleado.nombre, b.empleado.apellido, b.empleado.ocupacion.ocupacions) "
			+ "LIKE %?1%")
	public List<Bonificacion> findAll(String palabraClave);
}
