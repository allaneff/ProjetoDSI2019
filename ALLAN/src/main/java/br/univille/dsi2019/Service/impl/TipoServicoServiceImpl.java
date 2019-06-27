package br.univille.dsi2019.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.dsi2019.Model.TipoServico;
import br.univille.dsi2019.Repository.TipoServicoRepository;
import br.univille.dsi2019.Service.TipoServicoService;
@Service
public class TipoServicoServiceImpl implements TipoServicoService{

	@Autowired
	private TipoServicoRepository repository;
	
	@Override
	public List<TipoServico> getAll() {
		return repository.findAll();
	}

	@Override
	public void save(TipoServico tipoServico) {
		repository.save(tipoServico);
		
	}

	@Override
	public void delete(TipoServico tipoServico) {
		repository.delete(tipoServico);
		
	}

	
}
