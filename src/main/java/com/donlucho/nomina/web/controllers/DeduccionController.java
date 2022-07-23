package com.donlucho.nomina.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.donlucho.nomina.business.dto.DeduccionDTO;
import com.donlucho.nomina.business.entities.Deduccion;
import com.donlucho.nomina.business.services.DeduccionService;

@Controller
@RequestMapping("/deduccion")
public class DeduccionController {
	@Autowired
	@Qualifier("deduccionservice")
	private DeduccionService deduccionService;

	@PostMapping("/add")
	public String add(@ModelAttribute(name = "deducciones") DeduccionDTO deduccionDTO) {
		Deduccion deduccion = new Deduccion();

		deduccion.setId(deduccionDTO.getId());
		deduccion.setMotivo(deduccionDTO.getMotivo());
		deduccion.setMonto(deduccionDTO.getMonto());
		deduccion.setFecha(deduccionDTO.getFecha());
		deduccion.setEmpleado(deduccionDTO.getEmpleado());
		deduccion.setPlanilla(deduccionDTO.getPlanilla());

		deduccionService.addDeduccion(deduccion);
		return "redirect:/deducciones.htm";
	}
}
