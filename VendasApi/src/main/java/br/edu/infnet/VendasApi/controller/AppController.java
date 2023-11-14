package br.edu.infnet.VendasApi.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vendas")
public class AppController {

	@GetMapping(value = "/informacoes")
	public List<String> obterInformacao(){
		return new ArrayList<String>(Arrays.asList("Professor: Elberth", "Disciplina: Arquitetura Java", "Instituicao: Infnet"));
	}
}
