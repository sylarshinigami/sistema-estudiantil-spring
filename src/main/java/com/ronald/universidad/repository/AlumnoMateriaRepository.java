package com.ronald.universidad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronald.universidad.entity.Alumno;
import com.ronald.universidad.entity.Notas;

public interface AlumnoMateriaRepository extends JpaRepository<Notas, Long> {

}
