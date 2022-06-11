package br.com.drogaria.sistema.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
}
