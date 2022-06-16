package com.donlucho.nomina.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpleadoCtr {
	@RequestMapping(method = RequestMethod.GET, value = "/empleado.htm")
	public ModelAndView manejadorVistaEmpleado() {
		return new ModelAndView("empleado");
	}
}
