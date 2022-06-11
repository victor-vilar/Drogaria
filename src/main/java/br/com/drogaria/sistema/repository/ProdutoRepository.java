package br.com.drogaria.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.drogaria.sistema.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Short> {

}
