package com.ronald.universidad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ronald.universidad.entity.Encargado;

@Repository
public interface EncargadoRepository extends JpaRepository<Encargado, Long> {

}
