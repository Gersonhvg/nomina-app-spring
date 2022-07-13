package com.donlucho.nomina.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.donlucho.nomina.business.services.EmpleadoService;

@Controller
public class EmpleadosController {
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private EmpleadoService empleadoService;

	@RequestMapping(value = "/empleados.htm")
	public ModelAndView manejadorVistaEmpleados() {
		Map<String, Object> empleadoModel = new HashMap<String, Object>();
		empleadoModel.put("empleados", this.empleadoService.listarEmpleados());
		
		logger.info("Resolviendo la lista de empleados.");
		logger.info(empleadoModel);
		
		return new ModelAndView("empleados", "model", empleadoModel);
	}
}
