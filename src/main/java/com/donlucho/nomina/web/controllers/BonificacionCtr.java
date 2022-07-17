package com.donlucho.nomina.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.donlucho.nomina.business.dto.BonificacionDTO;
import com.donlucho.nomina.business.entities.Bonificacion;
import com.donlucho.nomina.business.services.BonificacionService;

@Controller
public class BonificacionCtr {
	@Autowired
	@Qualifier("bonificacionservice")
	private BonificacionService bonificacionService;

	@RequestMapping(value = "/bonedit/{id}")
	public String mostrarVista(@PathVariable int id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("command", bonificacionService.getBonificacionId(id).orElse(null));
		return "bonedit";
	}

	@PostMapping("/bonedit/{id}")
	public String updateBonificacion(@PathVariable int id, @ModelAttribute("bonificacion") BonificacionDTO bonificacion) {
		
		Bonificacion bonificacion1=new Bonificacion();
		
		//Mapper BonificacionDTO hacia Bonificacion
		
		bonificacion1.setId(bonificacion.getId());
		
				
		bonificacionService.updateBonificacion(id, bonificacion1);
		
		return "redirect:/bonificaciones.htm";
	}
}
