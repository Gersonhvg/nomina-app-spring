package com.donlucho.nomina.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.donlucho.nomina.business.entities.Empleado;
import com.donlucho.nomina.business.repositories.EmpleadoJpaRepository;

@Service("empleadoservice")
public class EmpleadoServiceImpl implements EmpleadoService {
	@Autowired
	@Qualifier("empleadorepository")
	private EmpleadoJpaRepository empleadoRepository;

	@Override
	public List<Empleado> ListarEmpleados() {
		// TODO Auto-generated method stub
		return empleadoRepository.findAll();
	}

	@Override
	public Empleado addEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return empleadoRepository.save(empleado);
	}
}
