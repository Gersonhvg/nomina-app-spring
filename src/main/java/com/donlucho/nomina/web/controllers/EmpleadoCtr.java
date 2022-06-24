package com.donlucho.nomina.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.donlucho.nomina.business.entities.Empleado;
import com.donlucho.nomina.business.services.EmpleadoService;

@Controller
public class EmpleadoCtr {
	@Autowired
	@Qualifier("empleadoservice")
	private EmpleadoService empleadoService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/empleado.htm")
	public ModelAndView manejadorVistaEmpleado() {
		return new ModelAndView("empleado");
	}
	
	@RequestMapping(value = "/empedit/{id}")
	public String mostrarVista(@PathVariable int id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("emp", empleadoService.getEmpleadoId(id).orElse(null));
		return "empedit";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/empedit/{id}")
	public String updateEmpleado(@PathVariable int id, @ModelAttribute("empleado") Empleado empleado) {
		empleadoService.updateEmpleado(id, empleado);
		return "redirect:/empleados.htm";
	}
}
