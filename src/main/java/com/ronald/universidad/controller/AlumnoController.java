package com.ronald.universidad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ronald.universidad.entity.Alumno;
import com.ronald.universidad.repository.AlumnoRepository;


@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	
	@GetMapping("/form")
	public String form() {
		return "carrera/form";
	}

	
	@GetMapping("/listar")
	public String listar(Model model) {
		
		List<Alumno> alumnos = alumnoRepository.findAll();
		model.addAttribute("alumnos", alumnos);
		model.addAttribute("titulo", "Listado de alumnos");
		return "alumno/listar";
	}
}
