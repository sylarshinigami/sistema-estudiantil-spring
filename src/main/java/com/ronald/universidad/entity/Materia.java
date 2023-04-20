package com.ronald.universidad.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "materias")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Materia {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String nombre;
	
	private int estado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Profesor profesor;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Carrera carrera;
	
	@ManyToMany( mappedBy = "materias")
	private List<Alumno> alumnos;
	
	
	
}
