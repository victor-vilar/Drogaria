package br.com.drogaria.sistema.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Produto {

	private @Id @GeneratedValue  Short id;
	
	@Column(nullable = false, length=50)
	private String nome;
	
	@Column(nullable=false)
	private Short quantidade;
	
	@Column(nullable=false, precision = 6, scale= 2)
	private BigDecimal valor;
	
	@Column
	private LocalDate dataValidade;
	
	@ManyToOne
	@JoinColumn(nullable=true, name="categoria_id")
	private Categoria categoria;
	
	private void newCategoria(Categoria categoria) {
		categoria.addNewProduto(this);
		this.categoria = categoria;
	}
}
