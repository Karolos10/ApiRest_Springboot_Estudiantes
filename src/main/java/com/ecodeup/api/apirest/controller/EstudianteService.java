package com.ecodeup.api.apirest.controller;

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

}