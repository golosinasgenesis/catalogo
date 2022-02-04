 	package com.willdev.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.willdev.domain.CategoriaEntity;
import com.willdev.model.CategoriaRequest;
import com.willdev.model.Response;
import com.willdev.service.CategoriaService;

@RestController
@RequestMapping("v1/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping
	public List<CategoriaEntity> listarCategorias(){
		return categoriaService.findAllCategorias();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<CategoriaEntity> obtenerCategoria(@PathVariable Long id){
		return new ResponseEntity<>(categoriaService.findCategoriaById(id),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<CategoriaEntity> registrarCategoria(@Valid @RequestBody CategoriaRequest categoriaRequest){
		return new ResponseEntity<>(categoriaService.saveCategoria(categoriaRequest),HttpStatus.CREATED);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<CategoriaEntity> actualizarCategoria(@PathVariable Long id,@RequestBody @Valid CategoriaRequest categoriaRequest){
		categoriaRequest.setId(id);
		return new ResponseEntity<>(categoriaService.updateCategoria(categoriaRequest),HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Response> eliminarCategoria(@PathVariable Long id){
		categoriaService.deleteCategoriaById(id);
		return new ResponseEntity<>(new Response("SE ELIMINÓ CORRECTAMENTE"),HttpStatus.OK);
	}

}
