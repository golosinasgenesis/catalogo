package com.willdev.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.willdev.domain.Categoria;
import com.willdev.repository.CategoriaRepository;
import com.willdev.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	public Categoria registrar(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

	@Override
	public List<Categoria> listaCategorias() {
		return categoriaRepository.findAll();
	}

}
