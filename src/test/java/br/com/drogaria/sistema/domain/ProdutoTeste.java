package br.com.drogaria.sistema.domain;
import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutoTeste {
	
	@Test
	public void criar() {
		
		Produto produto = new Produto();
		
		produto.setId(Short.valueOf("1"));
		produto.setNome("Rivotril");
		produto.setQuantidade(Short.valueOf("150"));
		produto.setValor(new BigDecimal(352.22));
		produto.setDataValidade(LocalDate.now());
		
		System.out.println(produto);
	}
	
	
}
