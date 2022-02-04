package com.willdev.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaRequest {
	
	private Long id;
	
	@NotNull(message = "Es obligatorio")
	@NotEmpty(message = "No puede estar vaciosss")
	private String nombre;
	
	@NotNull(message = "Es obligatorio")
	@NotEmpty(message = "No puede estar vacio")
	private String descripcion;

}
