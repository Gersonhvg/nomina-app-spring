package com.donlucho.nomina.business.services;

import java.util.List;

import com.donlucho.nomina.business.entities.Planilla;

public interface PlanillaService {
	public List<Planilla> listarPlanilla();

	public Planilla addPlanilla(Planilla planilla);
}
