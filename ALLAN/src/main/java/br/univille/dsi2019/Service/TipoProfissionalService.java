package br.univille.dsi2019.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.univille.dsi2019.Model.TipoProfissional;

@Service
public interface TipoProfissionalService {

	List<TipoProfissional> getAll();
	void save(TipoProfissional tipoProfissional);
	void delete(TipoProfissional tipoProfissional);
}
