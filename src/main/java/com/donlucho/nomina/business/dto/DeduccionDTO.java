package com.donlucho.nomina.business.dto;

import java.sql.Date;

import com.donlucho.nomina.business.entities.Empleado;
import com.donlucho.nomina.business.entities.Planilla;

import lombok.Data;

@Data
public class DeduccionDTO {
	private Integer id;
	private String motivo;
	private Double monto;
	private Date fecha;
	private Empleado empleado;
	private Planilla planilla;
}
