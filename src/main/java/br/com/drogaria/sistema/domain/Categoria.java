package br.com.drogaria.sistema.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Categoria {

	@Id
	@GeneratedValue
	private Byte id;
	
	@Column(nullable = false, length = 50, unique=true)
	private String nome;
	
	@OneToMany
	private List<Produto> produtos = new ArrayList<>();

	
	public void addNewProduto(Produto produto) {
		produtos.add(produto);
	}
}
