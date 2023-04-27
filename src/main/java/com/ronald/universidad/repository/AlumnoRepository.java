package com.ronald.universidad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronald.universidad.entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

	
}
