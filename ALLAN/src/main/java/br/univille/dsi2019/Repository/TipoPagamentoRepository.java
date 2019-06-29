package br.univille.dsi2019.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.univille.dsi2019.Model.TipoPagamento;

public interface TipoPagamentoRepository extends JpaRepository<TipoPagamento, Long> {

	TipoPagamento findByTipoPagamento(String tipoPagamento);
	
}

