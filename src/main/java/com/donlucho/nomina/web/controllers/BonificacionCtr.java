package com.donlucho.nomina.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BonificacionCtr {
	//Bonificación
		@RequestMapping(method = RequestMethod.GET, value = "/bonificacion.htm")
		public ModelAndView manejadorVistaBonificacion() {
			return new ModelAndView("bonificacion");
		}
}
