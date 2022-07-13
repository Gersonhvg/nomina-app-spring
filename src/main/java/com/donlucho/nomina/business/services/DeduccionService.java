package com.donlucho.nomina.business.services;

import java.util.List;
import java.util.Optional;

import com.donlucho.nomina.business.entities.Deduccion;

public interface DeduccionService {
	public List<Deduccion> listarDeduccion(String palabraClave);

	public Deduccion addDeduccion(Deduccion deduccion);

	public Optional<Deduccion> getDeduccionId(Integer id);

	public Deduccion updateDeduccion(int id, Deduccion deduccion);

	public void deleteById(int id);
}
