package com.donlucho.nomina.business.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Entity
@Table(name = "empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "dni")
	private String dni;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;

	@Column(name = "correo")
	private String correo;

	@Column(name = "direccion")
	private String direccion;

	@Column(name = "nacimiento")
	private Date nacimiento;

	@Column(name = "genero")
	private String genero;

	@OneToOne
	@JoinColumn(name = "ocupacionId")
	private Ocupacion ocupacion;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "empleado")
	private List<Bonificacion> bonificaciones = new ArrayList<>();

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy = "empleado")
	private List<Deduccion> deducciones = new ArrayList<>();
}
