package com.donlucho.nomina.business.services;

import java.util.List;

import com.donlucho.nomina.business.entities.Ocupacion;

public interface OcupacionService {
	public List<Ocupacion> listarOcupacion();

	public Ocupacion addOcupacion(Ocupacion ocupacion);
}
