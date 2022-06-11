package br.com.drogaria.sistema.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.drogaria.sistema.domain.Produto;

@SpringBootTest
public class ProdutoRepositoryTeste {

	
	@Autowired
	private ProdutoRepository produtoRepository;

	@Test
	public void salvar() {
		
		Produto produto = new Produto();
		
		produto.setNome("Rivotril");
		produto.setQuantidade(Short.valueOf("150"));
		produto.setValor(new BigDecimal(352.22));
		produto.setDataValidade(LocalDate.now());
		
		produtoRepository.save(produto);
		
	}
}
