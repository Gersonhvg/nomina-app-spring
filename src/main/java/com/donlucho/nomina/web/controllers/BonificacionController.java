package com.donlucho.nomina.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.donlucho.nomina.business.entities.Bonificacion;
import com.donlucho.nomina.services.BonificacionService;

@Controller
@RequestMapping("/bonificacion")
public class BonificacionController {
	@Autowired
	@Qualifier("bonificacionservice")
	private BonificacionService bonificacionService;
	
	@PostMapping("/add")
	public String add(@ModelAttribute(name = "bonificaciones") Bonificacion bonificacion) {
		bonificacionService.addBonificacion(bonificacion);
		return "redirect:/bonificaciones.htm";
	}
}
