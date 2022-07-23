package com.donlucho.nomina.business.dto;

import java.sql.Date;
import com.donlucho.nomina.business.entities.Ocupacion;
import lombok.Data;

@Data
public class EmpleadoDTO {
	private Integer id;
	private String dni;
	private String nombre;
	private String apellido;
	private String correo;
	private String direccion;
	private Date nacimiento;
	private String genero;
	private Ocupacion ocupacion;
}
