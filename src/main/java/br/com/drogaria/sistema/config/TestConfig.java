package br.com.drogaria.sistema.config;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.drogaria.sistema.domain.Produto;
import br.com.drogaria.sistema.repository.ProdutoRepository;




@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Override
	public void run(String... args) throws Exception{
		
		Produto produto = new Produto();
		produto.setNome("Rivotril");
		produto.setQuantidade(Short.valueOf("150"));
		produto.setValor(new BigDecimal(352.22));
		produto.setDataValidade(LocalDate.now());
		produtoRepository.save(produto);
	}
}
