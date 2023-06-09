package com.ronald.universidad;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.ronald.universidad.entity.Alumno;
import com.ronald.universidad.entity.Notas;
import com.ronald.universidad.entity.Carrera;
import com.ronald.universidad.entity.Horario;
import com.ronald.universidad.entity.Materia;
import com.ronald.universidad.entity.Profesor;
import com.ronald.universidad.repository.AlumnoRepository;
import com.ronald.universidad.repository.CarreraRepository;
import com.ronald.universidad.repository.HorarioRepository;
import com.ronald.universidad.repository.MateriaRepository;
import com.ronald.universidad.repository.NotaRepository;
import com.ronald.universidad.repository.ProfesorRepository;

@Service
@Configurable
public class InserccionDatos {

	@Autowired
	private AlumnoRepository alumnoRepository;

	@Autowired
	private CarreraRepository carreraRepository;

	@Autowired
	private ProfesorRepository profesorRepository;
	
	@Autowired
	private HorarioRepository horarioRepository;
	
	@Autowired
	private MateriaRepository materiaRepository;
	
	@Autowired
	private NotaRepository notaRepository;

	public void inicializar() {
		insertarAlumno("Ronald", "Aguilar", new Date(), new Date(), "colonia nuevo calvario", "7751-2313",
				"ronald@mail.com", "00278484-6", true);

		insertarAlumno("Arquimides", "Navarrete", new Date(), new Date(), "San Esteban Catarina", "2362-7323",
				"arquimides@mail.com", "00278484-7", true);

		insertarCarrera("Ingenieria de Sistemas informaticos", true, new Date(), "IS-2023");
		insertarCarrera("Profesorado en Matematicas", true, new Date(), "PM-2023");
		insertarCarrera("Licenciatura en Sociales", true, new Date(), "LS-2023");

		insertarProfesor("Jose", "Navarrete", 500.25, "San Vicente", "2393-7323", "jose@mail.com", "22278484-7",
				true);

		insertarProfesor("Amadeo", "Navarrete", 700.25, "San Ildefonso", "2356-7323", "amadeo@mail.com", "22568484-7",
				true);
		
		insertarHorario(LocalTime.of(20, 0) , LocalTime.of(22, 0), Arrays.asList("MARTES","MIERCOLES"));
		insertarHorario(LocalTime.of(12, 0) , LocalTime.of(14, 0), Arrays.asList("DOMINGO","LUNES"));

		
		insertarMateria("Lenguaje", true);
		insertarMateria("Estadistica", true);
		
		
		insertarNota(new Date(), "I/2023", 8.3);
	}

	public void insertarAlumno(String nombre, String apellido, Date fechaNacimiento, Date fechaIngreso,
			String direccion, String telefono, String email, String dui, boolean estado) {

		Alumno alumno = new Alumno();
		alumno.setNombre(nombre);
		alumno.setApellido(apellido);
		alumno.setFechaNacimiento(fechaNacimiento);
		alumno.setFechaIngreso(fechaNacimiento);
		alumno.setDireccion(direccion);
		alumno.setTelefono(telefono);
		alumno.setEmail(email);
		alumno.setDui(dui);
		alumno.setEstado(estado);

		alumnoRepository.save(alumno);
	}

	public void insertarCarrera(String nombre, boolean estado, Date fechaCreacion, String codigo) {
		Carrera carrera = new Carrera();
		carrera.setNombre(nombre);
		carrera.setEstado(estado);
		carrera.setFechaCreacion(fechaCreacion);
		carrera.setCodigo(codigo);

		carreraRepository.save(carrera);
	}

	public void insertarProfesor(String nombre, String apellido, Double salario, String direccion, String telefono,
			String email, String dui, boolean estado) {
		Profesor profesor = new Profesor();

		profesor.setNombre(nombre);
		profesor.setApellido(apellido);
		profesor.setSalario(salario);
		profesor.setDireccion(direccion);
		profesor.setTelefono(telefono);
		profesor.setEmail(email);
		profesor.setDui(dui);
		profesor.setEstado(estado);

		profesorRepository.save(profesor);

	}
	
	public void insertarHorario(LocalTime horaInicio, LocalTime horaFinal, List<String> dias) {
		Horario horario = new Horario();
		horario.setDias(dias);
		horario.setHoraInicio(horaInicio);
		horario.setHoraFinal(horaFinal);
		
		horarioRepository.save(horario);
	}
	
	public void insertarMateria(String nombre, boolean estado) {
		
		Profesor profesor = profesorRepository.findById(1L).get();
		Horario horario = horarioRepository.findById(1L).get();
		Carrera carrera = carreraRepository.findById(1L).get();
		
		Materia materia = new Materia();
		materia.setNombre(nombre);
		materia.setEstado(estado);
		
		materia.setProfesor(profesor);
		materia.setHorario(horario);
		materia.setCarrera(carrera);
		
		
		materiaRepository.save(materia);
		
	}
	
	public void insertarNota(Date fechaRegistro, String ciclo, Double notaFinal) {
		
		Alumno alumno = alumnoRepository.findById(1L).get();
		Materia materia = materiaRepository.findById(1L).get();
		
		Notas notas = new Notas();
		notas.setAlumno(alumno);
		notas.setMateria(materia);
		notas.setFechaRegistro(fechaRegistro);
		notas.setCiclo(ciclo);
		notas.setNotaFinal(notaFinal);
		
		
		notaRepository.save(notas);
		
		
	}

}
