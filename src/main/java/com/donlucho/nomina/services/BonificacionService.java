package com.donlucho.nomina.services;

import java.util.List;

import com.donlucho.nomina.business.entities.Bonificacion;

public interface BonificacionService {
	public List<Bonificacion> ListarBonificacion();
	public Bonificacion addBonificacion(Bonificacion bonificacion);
}
