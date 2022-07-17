package com.donlucho.nomina.business.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Entity
@Table(name = "bonificacion")
public class Bonificacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "motivo")
	private String motivo;

	@Column(name = "monto")
	private Double monto;

	@Column(name = "fecha")
	private Date fecha;

	@ManyToOne
	@JoinColumn(name = "empleadoId")
	private Empleado empleado;

	@ManyToOne
	@JoinColumn(name = "planillaId")
	private Planilla planilla;
}
