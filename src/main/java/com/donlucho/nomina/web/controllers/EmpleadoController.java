package com.donlucho.nomina.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.donlucho.nomina.business.dto.EmpleadoDTO;
import com.donlucho.nomina.business.entities.Empleado;
import com.donlucho.nomina.business.services.EmpleadoService;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
	@Autowired
	@Qualifier("empleadoservice")
	private EmpleadoService empleadoService;

	@PostMapping("/add")
	public String addEmpleado(@ModelAttribute(name = "empleados") EmpleadoDTO empleadoDTO) {
		Empleado empleado = new Empleado();

		empleado.setId(empleadoDTO.getId());
		empleado.setDni(empleadoDTO.getDni());
		empleado.setNombre(empleadoDTO.getNombre());
		empleado.setApellido(empleadoDTO.getApellido());
		empleado.setCorreo(empleadoDTO.getCorreo());
		empleado.setDireccion(empleadoDTO.getDireccion());
		empleado.setNacimiento(empleadoDTO.getNacimiento());
		empleado.setGenero(empleadoDTO.getGenero());
		empleado.setOcupacion(empleadoDTO.getOcupacion());

		empleadoService.addEmpleado(empleado);
		return "redirect:/empleados.htm";
	}
}
