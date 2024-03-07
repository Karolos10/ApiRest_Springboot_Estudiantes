package com.ecodeup.api.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecodeup.api.apirest.model.Estudiante;

@Service
public class EstudianteService {
	
	@Autowired
	private EstudiantesRepository estudiantesRepository;
	
	public void guardar (Estudiante estudiante) {
		
		estudiantesRepository.save(estudiante);
		
	}
	
	public List<Estudiante> obtenerTodos(){
		return estudiantesRepository.findAll();
	}
	
	public Estudiante obtenerEstudiante(Integer id) {
		return estudiantesRepository.getOne(id);
	}
	
	public void actualizar (Estudiante estudiante) {
		estudiantesRepository.save(estudiante);
	}

}
