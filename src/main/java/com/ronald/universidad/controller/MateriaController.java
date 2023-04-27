package com.ronald.universidad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ronald.universidad.entity.Materia;
import com.ronald.universidad.repository.MateriaRepository;

@Controller
@RequestMapping("/materia")
public class MateriaController {

	@Autowired
	private MateriaRepository materiaRepository;
	
	
	@GetMapping("/form")
	public String form() {
		return "materia/form";
	}
	
	
	@GetMapping("/listar")
	public String listar(Model model) {
		
		List<Materia> materias = materiaRepository.findAll();
		model.addAttribute("materias", materias);
		model.addAttribute("titulo", "Listado de materias");
		return "materia/listar";
	}
}
