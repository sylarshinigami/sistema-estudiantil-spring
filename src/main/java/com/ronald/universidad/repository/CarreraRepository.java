package com.ronald.universidad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ronald.universidad.entity.Carrera;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Long> {

}
