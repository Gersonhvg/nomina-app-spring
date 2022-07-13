package com.donlucho.nomina.business.services;

import java.util.List;
import java.util.Optional;

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
	public List<Bonificacion> listarBonificacion() {
		return bonificacionRepository.findAll();
	}

	@Override
	public Bonificacion addBonificacion(Bonificacion bonificacion) {
		return bonificacionRepository.save(bonificacion);
	}

	@Override
	public Optional<Bonificacion> getBonificacionId(Integer id) {
		return bonificacionRepository.findById(id);
	}

	@Override
	public Bonificacion updateBonificacion(int id, Bonificacion bonificacion) {
		Bonificacion updateBonificacion = bonificacionRepository.findById(id).orElse(null);
		updateBonificacion.setMotivo(bonificacion.getMotivo());
		updateBonificacion.setMonto(bonificacion.getMonto());
		updateBonificacion.setFecha(bonificacion.getFecha());
		updateBonificacion.setEmpleado(bonificacion.getEmpleado());
		updateBonificacion.setPlanilla(bonificacion.getPlanilla());

		return bonificacionRepository.save(updateBonificacion);
	}

	@Override
	public void deleteById(int id) {
		bonificacionRepository.deleteById(id);
	}
}
