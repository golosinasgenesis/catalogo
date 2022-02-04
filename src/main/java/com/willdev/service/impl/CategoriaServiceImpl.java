package com.willdev.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.willdev.domain.CategoriaEntity;
import com.willdev.model.CategoriaRequest;
import com.willdev.repository.CategoriaRepository;
import com.willdev.service.CategoriaService;
import com.willdev.service.impl.mapper.CategoriaMapper;

@Service
public class CategoriaServiceImpl implements CategoriaService{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	CategoriaMapper mapper = new CategoriaMapper();

	@Override
	public List<CategoriaEntity> findAllCategorias() {
		return categoriaRepository.findAll();
	}

	@Override
	public CategoriaEntity findCategoriaById(Long id) {
		return categoriaRepository.findById(id).get();
	}
	
	@Override
	public CategoriaEntity saveCategorias(CategoriaRequest categoriaRequest) {
		CategoriaEntity categoriaEntity = categoriaRequestToCategoriaEntity(categoriaRequest);
		return categoriaRepository.save(categoriaEntity);
	}
	
	@Override
	public CategoriaEntity saveCategoria(CategoriaRequest categoriaRequest) {
		CategoriaEntity categoriaEntity = mapper.categoriaRequestToCategoriaEntity(categoriaRequest);
		return categoriaRepository.save(categoriaEntity);
	}

	@Override
	public CategoriaEntity updateCategoria(CategoriaRequest categoriaRequest) {
		CategoriaEntity categoriaEntity = mapper.categoriaRequestToCategoriaEntity(categoriaRequest);
		return categoriaRepository.save(categoriaEntity);
	}

	@Override
	public void deleteCategoriaById(Long id) {
		categoriaRepository.deleteById(id);
	}
	
	private CategoriaEntity categoriaRequestToCategoriaEntity(CategoriaRequest categoriaRequest) {
		CategoriaEntity categoriaEntity = new CategoriaEntity();
		categoriaEntity.setNombre(categoriaRequest.getNombre());
		categoriaEntity.setDescripcion(categoriaRequest.getDescripcion());
		return categoriaEntity;
	}
	

}
