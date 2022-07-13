package com.donlucho.nomina.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.donlucho.nomina.business.entities.Planilla;
import com.donlucho.nomina.business.repositories.PlanillaJpaRepository;

@Service("planillaservice")
public class PlanillaServiceImpl implements PlanillaService {
	@Autowired
	@Qualifier("planillarepository")
	private PlanillaJpaRepository planillaRepository;
	
	@Override
	public List<Planilla> listarPlanilla() {
		return planillaRepository.findAll();
	}

	@Override
	public Planilla addPlanilla(Planilla planilla) {
		return planillaRepository.save(planilla);
	}
}
