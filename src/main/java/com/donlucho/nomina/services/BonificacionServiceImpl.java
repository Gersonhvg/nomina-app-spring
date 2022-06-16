package com.donlucho.nomina.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.donlucho.nomina.business.entities.Bonificacion;
import com.donlucho.nomina.business.repositories.BonificacionJpaRepository;

@Service("bonificacionservice")
public class BonificacionServiceImpl implements BonificacionService {
	@Autowired
	@Qualifier("bonificacionrepository")
	private BonificacionJpaRepository bonificacionRepository;

	@Override
	public List<Bonificacion> ListarBonificacion() {
		// TODO Auto-generated method stub
		return bonificacionRepository.findAll();
	}

	@Override
	public Bonificacion addBonificacion(Bonificacion bonificacion) {
		// TODO Auto-generated method stub
		return bonificacionRepository.save(bonificacion);
	}
}
