package br.com.drogaria.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.drogaria.sistema.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Short>{

}
