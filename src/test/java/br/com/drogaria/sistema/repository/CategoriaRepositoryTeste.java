package br.com.drogaria.sistema.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.drogaria.sistema.domain.Categoria;

public class CategoriaRepositoryTeste {
	
	@Autowired
	private static CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		
			List<Categoria> categorias = categoriaRepository.findAll();
			categorias.forEach(e -> System.out.println(e.toString()));
		
	
	}
}
