package com.donlucho.nomina.web.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.donlucho.nomina.business.services.BonificacionService;

@Controller
public class BonificacionesController {
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private BonificacionService bonificacionService;

	@RequestMapping(value = "/bonificaciones.htm")
	public ModelAndView manejadorVistaBonificaciones(HttpServletRequest request, HttpServletResponse res) {
		String palabraClave = request.getParameter("palabraClave");

		Map<String, Object> bonificacionModel = new HashMap<>();
		bonificacionModel.put("bonificaciones", this.bonificacionService.listarBonificacion(palabraClave));

		logger.info("Resolviendo la lista de bonificaciones.");
		logger.info(bonificacionModel);

		return new ModelAndView("bonificaciones", "model", bonificacionModel);
	}

	@RequestMapping(value = "/del-bon/{id}")
	public String deleteBonificacion(@PathVariable int id) {
		bonificacionService.deleteById(id);
		return "redirect:/bonificaciones.htm";
	}
}
