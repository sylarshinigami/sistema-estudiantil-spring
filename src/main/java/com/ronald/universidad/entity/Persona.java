package com.ronald.universidad.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(min = 3, max = 60, message = "El nombre debe tener una longitud entre 3 y 60 caracteres")
	@NotEmpty(message = "El nombre no puede quedar vacio")
	private String nombre;
	
	@Size(min = 3, max = 60, message = "El apellido debe tener una longitud entre 3 y 60 caracteres")
	@NotEmpty(message = "El apellido no puede quedar vacio")
	private String apellido;
	
	
	@Size(min = 3, max = 200, message = "La direccion debe tener una longitud entre 3 y 200 caracteres")
	@NotEmpty(message = "La direccion no puede quedar vacia")
	private String direccion;
	
	@NotEmpty(message = "El telefono no puede quedar vacio")
	@Pattern(regexp = "[0-9]{4}-[0-9]{4}", message = "No es un formato valido de telefono ####-####")
	private String telefono;
	
	@Length(max = 75)
	@Column( unique = true)
	@Email(message = "El correo no es valido")
	private String email;
	
	@Length(max = 12)
	@Column( unique = true)
	private String DUI;
	
	private boolean estado;

	
	
}
