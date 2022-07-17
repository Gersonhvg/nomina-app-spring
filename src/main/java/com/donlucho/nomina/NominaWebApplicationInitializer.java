package com.donlucho.nomina;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import com.donlucho.nomina.business.NominaBusinessConfig;
import com.donlucho.nomina.web.NominaWebConfig;

public class NominaWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { NominaBusinessConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { NominaWebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}
