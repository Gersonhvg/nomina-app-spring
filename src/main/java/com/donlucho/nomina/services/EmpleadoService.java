package com.donlucho.nomina.services;

import java.util.List;
import com.donlucho.nomina.business.entities.Empleado;

public interface EmpleadoService {
	public List<Empleado> ListarEmpleados();
	public Empleado addEmpleado(Empleado empleado);
}
