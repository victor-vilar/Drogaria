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
	@Column(nullable = false)
	private String nome;
	private Short quantidade;
	private BigDecimal valor;
	private LocalDate dataValidade;
}
