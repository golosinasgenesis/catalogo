package com.willdev.service;

import java.util.List;

import com.willdev.domain.CategoriaEntity;
import com.willdev.model.CategoriaRequest;

public interface CategoriaService {
	
	List<CategoriaEntity> findAllCategorias();
	CategoriaEntity findCategoriaById(Long id);
	CategoriaEntity saveCategorias(CategoriaRequest categoria);
	CategoriaEntity saveCategoria(CategoriaRequest categoria);
	CategoriaEntity updateCategoria(CategoriaRequest categoria);
	void deleteCategoriaById(Long id);

}
