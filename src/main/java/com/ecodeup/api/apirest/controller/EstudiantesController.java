package com.ecodeup.api.apirest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecodeup.api.apirest.model.Estudiante;

@RestController
public class EstudiantesController {
	
	@GetMapping("api/estudiante")
	public List<Estudiante> obtenerEstudiantes(){
		List<Estudiante> ListaEstudiantes = new ArrayList<>();
		Estudiante e = new Estudiante();
		
		e.setId(1);
		e.setNombres("Carlos");
		e.setApellidos("Rodriguez");
		e.setEmail("karlos@gmail.com");
		e.setNota(5.0);
		
		Estudiante e1 = new Estudiante();
		e1.setId(2);
		e1.setNombres("Miguel");
		e1.setApellidos("Botero");
		e1.setEmail("miguel@gmail.com");
		e1.setNota(4.0);
		
		ListaEstudiantes.add(e);
		ListaEstudiantes.add(e1);
		
		return ListaEstudiantes;
	}

}