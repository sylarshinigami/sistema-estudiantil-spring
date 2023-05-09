package com.ronald.universidad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ronald.universidad.entity.Carrera;
import com.ronald.universidad.repository.CarreraRepository;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/carrera")
public class CarreraController {

	@Autowired
	private CarreraRepository carreraRepository;

	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("titulo", "Ingreso de carrera");
		model.addAttribute("carrera", new Carrera());
		return "carrera/form";
	}

	@GetMapping("/listar")
	public String listar(Model model) {

		List<Carrera> carreras = carreraRepository.findAll();
		model.addAttribute("carreras", carreras);
		model.addAttribute("titulo", "Listado de Carrera");
		return "carrera/listar";
	}

	@PostMapping("/save")
	public String save(@Valid Carrera carrera, BindingResult result, Model model, RedirectAttributes flash) {

		if (result.hasErrors()) {
			if (carrera.getId() == null)
				model.addAttribute("titulo", "Ingreso de carrera");
			else
				model.addAttribute("titulo", "Editando la carrera: ".concat(carrera.getNombre()));
			return "carrera/form";
		}

		if (carrera.getId() == null) {
			flash.addFlashAttribute("success", "Carrera guardada con exito.");
			carrera.setEstado(true);
		} else
			flash.addFlashAttribute("info", "Carrera actualizada con exito.");

		carreraRepository.save(carrera);
		return "redirect:/carrera/listar";
	}

}
