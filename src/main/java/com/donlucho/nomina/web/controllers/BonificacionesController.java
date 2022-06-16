package com.donlucho.nomina.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.donlucho.nomina.services.BonificacionService;

@Controller
public class BonificacionesController {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private BonificacionService bonificacionService;
	
	//Bonificaciones
	@RequestMapping(value = "/bonificaciones.htm")
	public ModelAndView manejadorVistaBonificaciones() {
		Map<String, Object> bonificacionModel = new HashMap<String, Object>();
		bonificacionModel.put("bonificaciones", this.bonificacionService.ListarBonificacion());
		
		logger.info("Resolviendo la lista de bonificaciones.");
		logger.info(bonificacionModel);
		
		return new ModelAndView("bonificaciones", "model", bonificacionModel);
	}
}