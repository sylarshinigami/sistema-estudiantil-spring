package com.ronald.universidad.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	private boolean estado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Profesor profesor;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Carrera carrera;
	
	@OneToMany( mappedBy = "materia", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Notas> notas;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Horario horario;
	
}
