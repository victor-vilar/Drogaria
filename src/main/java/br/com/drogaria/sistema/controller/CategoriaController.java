package br.com.drogaria.sistema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.drogaria.sistema.domain.Categoria;
import br.com.drogaria.sistema.repository.CategoriaRepository;

@RestController
@RequestMapping("categorias")
public class CategoriaController {

	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public List<Categoria> listar(){
		return categoriaRepository.findAll();
	}
	
	
}
