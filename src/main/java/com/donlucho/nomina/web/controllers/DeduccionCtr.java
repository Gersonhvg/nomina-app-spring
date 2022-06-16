package com.donlucho.nomina.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DeduccionCtr {
	//Deducción
		@RequestMapping(method = RequestMethod.GET, value = "/deduccion.htm")
		public ModelAndView manejadorVistaDeduccion() {
			return new ModelAndView("deduccion");
		}
}
