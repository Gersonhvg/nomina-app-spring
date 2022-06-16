package com.donlucho.nomina.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.donlucho.nomina.business.entities.Deduccion;
import com.donlucho.nomina.business.repositories.DeduccionJpaRepository;

@Service("deduccionservice")
public class DeduccionServiceImpl implements DeduccionService {
	@Autowired
	@Qualifier("deduccionrepository")
	private DeduccionJpaRepository deduccionRepository;

	@Override
	public List<Deduccion> ListarDeduccion() {
		// TODO Auto-generated method stub
		return deduccionRepository.findAll();
	}

	@Override
	public Deduccion addDeduccion(Deduccion deduccion) {
		// TODO Auto-generated method stub
		return deduccionRepository.save(deduccion);
	}
}
