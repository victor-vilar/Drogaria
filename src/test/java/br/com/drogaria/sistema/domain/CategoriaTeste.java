package br.com.drogaria.sistema.domain;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.drogaria.sistema.repository.CategoriaRepository;

@SpringBootTest
public class CategoriaTeste {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	

	@Test
	public void buscarTodos() {
		List<Categoria> categorias = categoriaRepository.findAll();
		categorias.forEach(e -> System.out.println(e.toString()));
	}
	
}
