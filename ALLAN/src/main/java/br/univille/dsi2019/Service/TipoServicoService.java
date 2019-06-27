package br.univille.dsi2019.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import br.univille.dsi2019.Model.TipoServico;

@Service
public interface TipoServicoService {

	List<TipoServico> getAll();
	void save(TipoServico tipoServico);
	void delete(TipoServico tipoServico);
}
