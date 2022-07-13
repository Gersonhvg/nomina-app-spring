package com.donlucho.nomina.web.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InicioController {
	@RequestMapping("/inicio.htm")
	public ModelAndView manejadorVistaInicio(HttpServletRequest request, HttpServletResponse res) {
		String email = request.getParameter("email");
		String contrasenia = request.getParameter("contrasenia");
		
		if(contrasenia.equals("123456") && (email.equals("contador@donlucho.pe"))) {
			return new ModelAndView("inicio");
		} else {
			return new ModelAndView("login", "msg", "ERROR: Correo o contraseña incorrectos");
		}
	}
}
