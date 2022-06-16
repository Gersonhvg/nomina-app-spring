package com.donlucho.nomina.services;

import java.util.List;

import com.donlucho.nomina.business.entities.Deduccion;

public interface DeduccionService {
	public List<Deduccion> ListarDeduccion();
	public Deduccion addDeduccion(Deduccion deduccion);
}
