package com.ronald.universidad.entity;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table( name = "notas")
@NoArgsConstructor 
public class Notas {

	
	@Id
	@Column( name = "id_alumno_materia")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@ManyToOne
	@JoinColumn( name = "id_alumno")
	private Alumno alumno;
	
	@ManyToOne
	@JoinColumn( name = "id_materia")
	private Materia materia;
	
	
	@Column( name = "fecha_registro")
	@DateTimeFormat( iso = ISO.DATE)
	private Date fechaRegistro;

	private String ciclo;
	
	
	@Column( name = "nota_final")
	private Double notaFinal;
	
}
