package com.ronald.universidad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronald.universidad.entity.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Long> {

}
