package br.univille.dsi2019.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.univille.dsi2019.Model.TipoProfissional;

public interface TipoProfissionalRepository extends JpaRepository<TipoProfissional, Long> {
	
	TipoProfissional findBynomeTipoProfissional(String nomeTipoProfissional);
}
