package com.willdev.service.impl.mapper;

import org.modelmapper.ModelMapper;

import com.willdev.domain.CategoriaEntity;
import com.willdev.model.CategoriaRequest;

public class CategoriaMapper {
	
	private ModelMapper mapper = new ModelMapper();
	
	public CategoriaEntity categoriaRequestToCategoriaEntity(CategoriaRequest categoriaRequest) {
		return mapper.map(categoriaRequest, CategoriaEntity.class);
	}

}
