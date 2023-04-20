package com.ronald.universidad.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table( name = "alumnos")
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
public class Alumno extends Persona {

	@Column( name = "fecha_nacimiento")
	@DateTimeFormat( iso = ISO.DATE)
	private Date fechaNacimiento;
	
	
	@Column( name = "fecha_ingreso")
	@DateTimeFormat( iso = ISO.DATE)
	private Date fechaIngreso;


	public Alumno(Long id, String nombre, String apellido, String Direccion, String Telefono, String email, String DUI,
			Integer estado) {
		super(id, nombre, apellido, Direccion, Telefono, email, DUI, estado);
		// TODO Auto-generated constructor stub
	}
	
	@OneToMany( mappedBy = "alumno", fetch = FetchType.LAZY,
			cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Encargado> encargados;
	
	
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "alumno_materia", 
        joinColumns =  { @JoinColumn(name = "alumno_id") }, 
        inverseJoinColumns = { @JoinColumn (name = "materia_id") }
    )
    List<Materia> materias = new ArrayList<>();
   
	
	public void addMateria(Materia materia) {
		if( materia != null)
			materias.add(materia);
	}
	
}
