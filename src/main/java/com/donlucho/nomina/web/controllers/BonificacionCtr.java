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

import com.donlucho.nomina.business.entities.Bonificacion;
import com.donlucho.nomina.business.services.BonificacionService;

@Controller
public class BonificacionCtr {
	@Autowired
	@Qualifier("bonificacionservice")
	private BonificacionService bonificacionService;


	@RequestMapping(method = RequestMethod.GET, value = "/bonificacion.htm")
	public ModelAndView manejadorVistaBonificacion() {
		return new ModelAndView("bonificacion");
	}
	
	@RequestMapping(value = "/bonedit/{id}")
	public String mostrarVista(@PathVariable int id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("command", bonificacionService.getBonificacionId(id).orElse(null));
		return "bonedit";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/bonedit/{id}")
	public String updateBonificacion(@PathVariable int id, @ModelAttribute("bonificacion") Bonificacion bonificacion) {
		bonificacionService.updateBonificacion(id, bonificacion);
		return "redirect:/bonificaciones.htm";
	}
}
