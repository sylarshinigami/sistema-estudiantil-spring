package com.ronald.universidad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronald.universidad.entity.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {

}
