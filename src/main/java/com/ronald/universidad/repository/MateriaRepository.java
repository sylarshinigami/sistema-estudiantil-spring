package com.ronald.universidad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ronald.universidad.entity.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long> {

}
