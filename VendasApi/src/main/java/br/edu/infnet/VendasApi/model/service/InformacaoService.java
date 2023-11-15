package br.edu.infnet.VendasApi.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.VendasApi.model.domain.Informacao;
import br.edu.infnet.VendasApi.model.repository.InformacaoRepository;

@Service
public class InformacaoService {
	
	@Autowired
	private InformacaoRepository repository;

	public List<Informacao> obterList() {
		return (List<Informacao>) repository.findAll();
	}

	public Informacao incluir(Informacao informacao) {
		return repository.save(informacao);
	}

}
