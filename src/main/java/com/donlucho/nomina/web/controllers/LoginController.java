package com.donlucho.nomina.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@GetMapping("/login.htm")
	public ModelAndView manejadorVistaLogin() {
		return new ModelAndView("login");
	}
}
