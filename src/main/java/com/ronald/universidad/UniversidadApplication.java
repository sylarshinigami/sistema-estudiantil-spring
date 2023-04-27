package com.ronald.universidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UniversidadApplication implements CommandLineRunner{

	@Autowired
	private  InserccionDatos inser;
	
	
	public static void main(String[] args) {
		SpringApplication.run(UniversidadApplication.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception{
		inser.inicializar();
	}
	
	
	

}
