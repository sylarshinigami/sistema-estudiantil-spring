package com.ronald.universidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ronald.universidad.entity.Encargado;
import com.ronald.universidad.repository.EncargadoRepository;


@RestController
public class Prueba {
	
	@Autowired
	private EncargadoRepository encargadoRepository;

	
	public Prueba() {
		super();
		// TODO Auto-generated constructor stub
	}




	@GetMapping("/ronald")
	public String ingresarDato() {

		Encargado en = new Encargado();
		en.setNombre("Ronald");
		en.setApellido("Aguilar");
		en.setDireccion("San esteban Catarina");
		en.setDui("00278484*6");
		en.setEmail("ronald@mail.com");
//		en.setEstado(1);
		en.setEstudios("Universidad");
		en.setParentesco("Padre");
		en.setTelefono("77512313");
		
		encargadoRepository.save(en);
		return en.toString();
	}
	
	@GetMapping("/arquimides")
	public String ingresarDatos() {

		Encargado en = new Encargado();
		en.setNombre("Ronald");
		en.setApellido("Aguilar");
		en.setDireccion("San esteban Catarina");
		en.setDui("00278484*8");
		en.setEmail("ronaldarquimides@mail.com");
//		en.setEstado(1);
		en.setEstudios("Universidad");
		en.setParentesco("Padre");
		en.setTelefono("77512313");
		
		encargadoRepository.save(en);
		return en.toString();
	}
}
