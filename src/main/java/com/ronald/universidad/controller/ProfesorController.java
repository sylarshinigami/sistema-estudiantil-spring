package com.ronald.universidad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ronald.universidad.entity.Profesor;
import com.ronald.universidad.repository.ProfesorRepository;

@Controller
@RequestMapping("/profesor")
public class ProfesorController {

	
	@Autowired
	private ProfesorRepository profesorRepository;
	

	
	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("titulo", "Ingreso de Profesor");
		model.addAttribute("profesor", new Profesor());
		return "profesor/form";
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		
		List<Profesor> profesores = profesorRepository.findAll();
		model.addAttribute("profesores", profesores);
		model.addAttribute("titulo", "Listado de Profesores");
		return "profesor/listar";
	}
	
}
