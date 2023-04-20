package com.ronald.universidad.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String nombre;
	
	private int estado;
	
	@OneToMany( mappedBy = "carrera", fetch = FetchType.LAZY,
			cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Materia> materias;
}
