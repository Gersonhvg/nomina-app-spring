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

import com.donlucho.nomina.business.services.DeduccionService;

@Controller
public class DeduccionesController {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private DeduccionService deduccionService;

	@RequestMapping(value = "/deducciones.htm")
	public ModelAndView manejadorVistaDeducciones(HttpServletRequest request, HttpServletResponse res) {
		String palabraClave = request.getParameter("palabraClave");
		
		Map<String, Object> deduccionModel = new HashMap<>();
		deduccionModel.put("deducciones", this.deduccionService.listarDeduccion(palabraClave));
		
		logger.info("Resolviendo la lista de deducciones.");
		logger.info(deduccionModel);
		
		return new ModelAndView("deducciones", "model", deduccionModel);
	}
	
	@RequestMapping(value = "/del-ded/{id}")
	public String deleteDeduccion(@PathVariable int id) {
		deduccionService.deleteById(id);
		return "redirect:/deducciones.htm";
	}
}
