package br.edu.infnet.VendasApi.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.edu.infnet.VendasApi.model.domain.Informacao;
import br.edu.infnet.VendasApi.model.service.InformacaoService;

@RestController
@RequestMapping("/api/informacao")
public class InformacaController {
	
	@Autowired
	private InformacaoService iService;
	
	@GetMapping(value = "/lista")
	public List<Informacao> obertLista(){
		return iService.obterList();
	}
	
	@PostMapping(value = "/incluir")
	public Informacao incluir(@RequestBody Informacao informacao) {
		return iService.incluir(informacao);
	}
}
