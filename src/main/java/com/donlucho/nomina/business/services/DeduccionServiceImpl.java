package com.donlucho.nomina.business.services;

import java.util.List;
import java.util.Optional;

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
	public List<Deduccion> listarDeduccion(String palabraClave) {
		if(palabraClave != null) {
			return deduccionRepository.findAll(palabraClave);
		}
		return deduccionRepository.findAll();
	}

	@Override
	public Deduccion addDeduccion(Deduccion deduccion) {
		return deduccionRepository.save(deduccion);
	}

	@Override
	public Optional<Deduccion> getDeduccionId(Integer id) {
		return deduccionRepository.findById(id);
	}

	@Override
	public Deduccion updateDeduccion(int id, Deduccion deduccion) {
		Deduccion updateDeduccion = deduccionRepository.findById(id).orElse(null);
		updateDeduccion.setMotivo(deduccion.getMotivo());
		updateDeduccion.setMonto(deduccion.getMonto());
		updateDeduccion.setFecha(deduccion.getFecha());
		updateDeduccion.setEmpleado(deduccion.getEmpleado());
		updateDeduccion.setPlanilla(deduccion.getPlanilla());
		
		return deduccionRepository.save(updateDeduccion);
	}
	
	@Override
	public void deleteById(int id) {
		deduccionRepository.deleteById(id);
	}
}
