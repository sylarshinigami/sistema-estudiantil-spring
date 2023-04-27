package com.ronald.universidad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ronald.universidad.entity.Horario;
import com.ronald.universidad.entity.Profesor;

public interface HorarioRepository extends JpaRepository<Horario, Long> {

	
	
}
