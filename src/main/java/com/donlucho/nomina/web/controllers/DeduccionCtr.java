package com.donlucho.nomina.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.donlucho.nomina.business.dto.DeduccionDTO;
import com.donlucho.nomina.business.entities.Deduccion;
import com.donlucho.nomina.business.services.DeduccionService;

@Controller
public class DeduccionCtr {
	@Autowired
	@Qualifier("deduccionservice")
	private DeduccionService deduccionService;

	@RequestMapping(value = "/dededit/{id}")
	public String mostrarVista(@PathVariable int id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("ded", deduccionService.getDeduccionId(id).orElse(null));
		return "dededit";
	}

	@PostMapping("/dededit/{id}")
	public String updateDeduccion(@PathVariable int id, @ModelAttribute("deduccion") DeduccionDTO deduccionDTO) {
		Deduccion deduccion = new Deduccion();

		deduccion.setId(deduccionDTO.getId());
		deduccion.setMotivo(deduccionDTO.getMotivo());
		deduccion.setMonto(deduccionDTO.getMonto());
		deduccion.setFecha(deduccionDTO.getFecha());
		deduccion.setEmpleado(deduccionDTO.getEmpleado());
		deduccion.setPlanilla(deduccionDTO.getPlanilla());

		deduccionService.updateDeduccion(id, deduccion);
		return "redirect:/deducciones.htm";
	}
}
