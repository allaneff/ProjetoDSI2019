package br.univille.dsi2019.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.dsi2019.Model.TipoPagamento;
import br.univille.dsi2019.Repository.TipoPagamentoRepository;
import br.univille.dsi2019.Service.TipoPagamentoService;

@Service
public class TipoPagamentoServiceImpl implements TipoPagamentoService {

	@Autowired
	private TipoPagamentoRepository repository;
	
	@Override
	public List<TipoPagamento> getAll() {
		return repository.findAll();
	}

	@Override
	public void save(TipoPagamento tipoPagamento) {
		repository.save(tipoPagamento);
		
	}

	@Override
	public void delete(TipoPagamento tipoPagamento) {
		repository.delete(tipoPagamento);
		
	}

}
