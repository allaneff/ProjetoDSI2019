package br.univille.dsi2019.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.univille.dsi2019.Model.LocalServico;

public interface LocalServicoRepository extends JpaRepository<LocalServico, Long>{
	
	LocalServico findBynomeLocal(String nomeLocal );
}
