package com.donlucho.nomina.business.services;

import java.util.List;
import java.util.Optional;

import com.donlucho.nomina.business.entities.Empleado;

public interface EmpleadoService {
	public List<Empleado> ListarEmpleados();
	public Empleado addEmpleado(Empleado empleado);
	public Optional<Empleado> getEmpleadoId(Integer id);
	public Empleado updateEmpleado(int id, Empleado empleado);
}
