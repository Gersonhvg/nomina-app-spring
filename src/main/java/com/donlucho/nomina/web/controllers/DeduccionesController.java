package com.donlucho.nomina.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.donlucho.nomina.business.services.DeduccionService;

@Controller
public class DeduccionesController {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private DeduccionService deduccionService;
	
	//Deducciones
	@RequestMapping(value = "/deducciones.htm")
	public ModelAndView manejadorVistaDeducciones() {
		Map<String, Object> deduccionModel = new HashMap<String, Object>();
		deduccionModel.put("deducciones", this.deduccionService.ListarDeduccion());
		
		logger.info("Resolviendo la lista de deducciones.");
		logger.info(deduccionModel);
		
		return new ModelAndView("deducciones", "model", deduccionModel);
	}
}
