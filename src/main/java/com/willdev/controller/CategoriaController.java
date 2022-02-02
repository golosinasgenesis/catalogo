 	package com.willdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.willdev.domain.Categoria;
import com.willdev.service.CategoriaService;

@RestController
@RequestMapping("v1/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping
	public List<Categoria> listarCategorias(){
		return categoriaService.listaCategorias();
	}
	
	@PostMapping
	public Categoria registrarCategoria(@RequestBody Categoria categoria){
		return categoriaService.registrar(categoria);
	}

}
