package com.ronald.universidad.entity;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Length(max = 50)
	private String nombre;
	
	@Length(max = 50)
	private String apellido;
	
	private String Direccion;
	
	@Length(max = 12)
	private String Telefono;
	
	@Length(max = 75)
	@Column( unique = true)
	private String email;
	
	@Length(max = 10)
	@Column( unique = true)
	private String DUI;
	
	private Integer estado;

	
	
}
