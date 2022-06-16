package com.donlucho.nomina.services;

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
		// TODO Auto-generated method stub
		return planillaRepository.findAll();
	}

	@Override
	public Planilla addPlanilla(Planilla planilla) {
		// TODO Auto-generated method stub
		return planillaRepository.save(planilla);
	}
}
