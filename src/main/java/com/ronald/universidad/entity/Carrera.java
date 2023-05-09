package com.ronald.universidad.entity;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "carreras")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carrera {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min = 3, max = 60, message = "El nombre debe tener una longitud entre 3 y 60 caracteres")
	@NotEmpty(message = "El nombre no puede quedar vacio")
	private String nombre;
	
	private boolean estado;
	
	@Column( name = "fecha_creacion")
	@Temporal(TemporalType.DATE)
//	@FutureOrPresent(message = "Fecha invalida debe de estar en el presente o el futuro.")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaCreacion;
	
	@Column( unique = true)
	@Pattern(regexp = "[A-Z]{2}-[0-9]{4}", message = "No es un formato valido de carrera AA-0000")
	private String codigo;
	
	@OneToMany( mappedBy = "carrera", fetch = FetchType.LAZY,
			cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Materia> materias;
}
