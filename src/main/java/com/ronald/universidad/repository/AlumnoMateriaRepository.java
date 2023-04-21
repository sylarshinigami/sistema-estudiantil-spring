package com.ronald.universidad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ronald.universidad.entity.Alumno;
import com.ronald.universidad.entity.AlumnoMateria;

@Repository
public interface AlumnoMateriaRepository extends JpaRepository<AlumnoMateria, Long> {

}
