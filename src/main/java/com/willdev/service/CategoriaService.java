package com.willdev.service;

import java.util.List;

import com.willdev.domain.Categoria;

public interface CategoriaService {
	
	Categoria registrar(Categoria categoria);
	List<Categoria> listaCategorias();

}
