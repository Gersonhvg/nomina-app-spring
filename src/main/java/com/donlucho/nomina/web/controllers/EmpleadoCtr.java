package com.donlucho.nomina.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.donlucho.nomina.business.dto.EmpleadoDTO;
import com.donlucho.nomina.business.entities.Empleado;
import com.donlucho.nomina.business.services.EmpleadoService;

@Controller
public class EmpleadoCtr {
	@Autowired
	@Qualifier("empleadoservice")
	private EmpleadoService empleadoService;

	@GetMapping("/empleado.htm")
	public ModelAndView manejadorVistaEmpleado() {
		return new ModelAndView("empleado");
	}

	@RequestMapping(value = "/empedit/{id}")
	public String mostrarVista(@PathVariable int id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("emp", empleadoService.getEmpleadoId(id).orElse(null));
		return "empedit";
	}

	@PostMapping("/empedit/{id}")
	public String updateEmpleado(@PathVariable int id, @ModelAttribute("empleado") EmpleadoDTO empleadoDTO) {
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

		empleadoService.updateEmpleado(id, empleado);
		return "redirect:/empleados.htm";
	}
}
