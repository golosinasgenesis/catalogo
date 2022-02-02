package com.willdev.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.willdev.domain.Persona;
import com.willdev.service.PersonaService;

@RestController
@RequestMapping("v1/persona")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping
	public List<Persona> listarPersonas(){
		return personaService.listar();
	}
	
	@PostMapping
	public ResponseEntity<Persona> registrarPersona(@Valid @RequestBody Persona persona) {
		return new ResponseEntity<Persona>(personaService.registrar(persona),HttpStatus.CREATED);
	}

}
