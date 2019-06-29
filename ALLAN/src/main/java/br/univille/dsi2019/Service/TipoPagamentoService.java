package br.univille.dsi2019.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import br.univille.dsi2019.Model.TipoPagamento;

@Service
public interface TipoPagamentoService {

	List<TipoPagamento> getAll();
	void save(TipoPagamento tipoPagamento);
	void delete(TipoPagamento tipoPagamento);
}
