package com.ronald.universidad.entity;

import java.sql.Time;
import java.time.LocalTime;
import java.util.List;

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
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table( name = "horarios")
@NoArgsConstructor
public class Horario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "hora_inicio")
	@Temporal( TemporalType.TIME)
	private LocalTime horaInicio;
	
	
	@Column( name = "hora_final")
	@Temporal( TemporalType.TIME)
	private LocalTime horaFinal;
	
	@Column( length =15 )
	private List<String> dias;
	
	
	@OneToMany( mappedBy = "horario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Materia> materias;
	 
}
