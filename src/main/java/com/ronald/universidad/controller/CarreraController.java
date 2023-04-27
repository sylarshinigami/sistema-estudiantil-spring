package com.ronald.universidad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ronald.universidad.entity.Carrera;
import com.ronald.universidad.repository.CarreraRepository;

@Controller
@RequestMapping("/carrera")
public class CarreraController {

	
	@Autowired
	private CarreraRepository carreraRepository;
	
	
	@GetMapping("/form")
	public String form() {
		return "carrera/form";
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		
		List<Carrera> carreras = carreraRepository.findAll();
		model.addAttribute("carreras", carreras);
		model.addAttribute("titulo", "Listado de Carrera");
		return "carrera/listar";
	}
	
}
