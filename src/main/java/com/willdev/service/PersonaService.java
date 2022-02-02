package com.willdev.service;

import java.util.List;

import com.willdev.domain.Persona;

public interface PersonaService {
	
	Persona registrar(Persona persona);
	List<Persona> listar();
	
}
