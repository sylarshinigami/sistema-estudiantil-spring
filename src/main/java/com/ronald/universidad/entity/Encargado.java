package com.ronald.universidad.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "encargados")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Encargado extends Persona {

	@Column(length = 50)
	private String parentesco;

	@Column(length = 150)
	private String estudios;

	public Encargado(Long id, String nombre, String apellido, String Direccion, String Telefono, String email,
			String DUI, Integer estado) {
		super(id, nombre, apellido, Direccion, Telefono, email, DUI, estado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Encargado [parentesco=" + parentesco + ", estudios=" + estudios + ", toString()=" + super.toString()
				+ "]";
	}

	@ManyToOne(fetch = FetchType.LAZY)
	private Alumno alumno;
}
