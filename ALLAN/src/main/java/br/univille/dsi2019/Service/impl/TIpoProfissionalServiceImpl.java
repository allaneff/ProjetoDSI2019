package br.univille.dsi2019.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.dsi2019.Model.TipoProfissional;
import br.univille.dsi2019.Repository.TipoProfissionalRepository;
import br.univille.dsi2019.Service.TipoProfissionalService;

@Service
public class TIpoProfissionalServiceImpl implements TipoProfissionalService{

	@Autowired
	private TipoProfissionalRepository repository;
	
	@Override
	public List<TipoProfissional> getAll() {
		return repository.findAll();
	}

	@Override
	public void save(TipoProfissional tipoProfissional) {
		repository.save(tipoProfissional);
		
	}

	@Override
	public void delete(TipoProfissional tipoProfissional) {
		repository.delete(tipoProfissional);
	}

}
