package com.donlucho.nomina.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.donlucho.nomina.business.entities.Ocupacion;
import com.donlucho.nomina.business.repositories.OcupacionJpaRepository;

@Service("ocupacionservice")
public class OcupacionServiceImpl implements OcupacionService {
	@Autowired
	@Qualifier("ocupacionrepository")
	private OcupacionJpaRepository ocupacionRepository;
	
	@Override
	public List<Ocupacion> listarOcupacion() {
		return ocupacionRepository.findAll();
	}

	@Override
	public Ocupacion addOcupacion(Ocupacion ocupacion) {
		return ocupacionRepository.save(ocupacion);
	}
}
