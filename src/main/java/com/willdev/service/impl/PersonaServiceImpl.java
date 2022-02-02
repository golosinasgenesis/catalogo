package com.willdev.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.willdev.domain.Persona;
import com.willdev.repository.PersonaRepository;
import com.willdev.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	private PersonaRepository personaRepository;
	
	@Override
	public Persona registrar(Persona persona) {
		return personaRepository.save(persona);
	}

	@Override
	public List<Persona> listar() {
		return personaRepository.findAll();
	}

}
