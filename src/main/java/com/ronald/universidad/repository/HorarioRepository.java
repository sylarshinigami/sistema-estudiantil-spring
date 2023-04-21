package com.ronald.universidad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ronald.universidad.entity.Horario;
import com.ronald.universidad.entity.Profesor;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Long> {

	
	
}
