package com.donlucho.nomina.business.dto;

import java.sql.Date;


import com.donlucho.nomina.business.entities.Empleado;
import com.donlucho.nomina.business.entities.Planilla;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class BonificacionDTO {

	private Integer id;

	private String motivo;

	private Double monto;

	private Date fecha;

	private Empleado empleado;

	private Planilla planilla;
}
