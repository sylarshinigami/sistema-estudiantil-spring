package com.ronald.universidad.entity;

import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	
	@Column(name = "horario_inicio")
	@Temporal( TemporalType.TIME)
	private Time horaInicio;
	
	
	@Column( name = "horario_final")
	@Temporal( TemporalType.TIME)
	private Time horaFinal;
	
	 
}
