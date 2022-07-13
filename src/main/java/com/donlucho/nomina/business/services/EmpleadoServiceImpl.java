package com.donlucho.nomina.business.services;

import java.util.List;
import java.util.Optional;

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
	public List<Empleado> listarEmpleados() {
		return empleadoRepository.findAll();
	}

	@Override
	public Empleado addEmpleado(Empleado empleado) {
		return empleadoRepository.save(empleado);
	}

	@Override
	public Optional<Empleado> getEmpleadoId(Integer id) {
		return empleadoRepository.findById(id);
	}

	@Override
	public Empleado updateEmpleado(int id, Empleado empleado) {
		Empleado updateEmpleado = empleadoRepository.findById(id).orElse(null);
		updateEmpleado.setDni(empleado.getDni());
		updateEmpleado.setNombre(empleado.getNombre());
		updateEmpleado.setApellido(empleado.getApellido());
		updateEmpleado.setCorreo(empleado.getCorreo());
		updateEmpleado.setDireccion(empleado.getDireccion());
		updateEmpleado.setNacimiento(empleado.getNacimiento());
		updateEmpleado.setGenero(empleado.getGenero());
		updateEmpleado.setOcupacion(empleado.getOcupacion());
		
		return empleadoRepository.save(updateEmpleado);
	}
}
