package br.com.drogaria.sistema.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/drogaria")
public class DrograriaController {

	@RequestMapping("/ola")
	public String exibirMensagem() {
		return " Olá Mundo !";
	}
	
}
