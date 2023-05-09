package com.ronald.universidad.controller;

import java.util.List;

import jakarta.validation.Valid ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ronald.universidad.entity.Alumno;
import com.ronald.universidad.repository.AlumnoRepository;


@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	

	
	@GetMapping("/listar")
	public String listar(Model model) {
		
		List<Alumno> alumnos = alumnoRepository.findAll();
		model.addAttribute("alumnos", alumnos);
		model.addAttribute("titulo", "Listado de alumnos");
		return "alumno/listar";
	}

	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("titulo", "Ingreso de Estudiante");
		model.addAttribute("alumno", new Alumno());
		return "alumno/form";
	}
	
	
	@PostMapping("/save")
	public String save(@Valid Alumno alumno, BindingResult result, Model model, RedirectAttributes flash) {

		if (result.hasErrors()) {
			if (alumno.getId() == null)
				model.addAttribute("titulo", "Listado de alumnos");
			else
				model.addAttribute("titulo", "Editando al alumno: ".concat(alumno.getNombre()));
			return "alumno/form";
		}
		
		
		if (alumno.getId() == null)
			flash.addFlashAttribute("success", "Alumno guardado con exito.");
		else
			flash.addFlashAttribute("info", "Alumno actualizado con exito.");
		
		
		return "redirect:/alumno/listar";
	}
	
}
