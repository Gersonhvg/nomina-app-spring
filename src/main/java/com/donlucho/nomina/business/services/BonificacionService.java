package com.donlucho.nomina.business.services;

import java.util.List;
import java.util.Optional;

import com.donlucho.nomina.business.entities.Bonificacion;

public interface BonificacionService {
	public List<Bonificacion> listarBonificacion();
	public Bonificacion addBonificacion(Bonificacion bonificacion);
	public Optional<Bonificacion> getBonificacionId(Integer id);
	public Bonificacion updateBonificacion(int id, Bonificacion bonificacion);
}
