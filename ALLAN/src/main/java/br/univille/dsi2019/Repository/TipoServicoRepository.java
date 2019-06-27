package br.univille.dsi2019.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.univille.dsi2019.Model.TipoServico;

public interface TipoServicoRepository extends JpaRepository<TipoServico, Long> {

	TipoServico findBynomeTipoServico(String nomeTipoServico);
	
}
