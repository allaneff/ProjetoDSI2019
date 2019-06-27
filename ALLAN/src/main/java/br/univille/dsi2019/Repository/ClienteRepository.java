package br.univille.dsi2019.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.univille.dsi2019.Model.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	Cliente findBynomeCliente(String nomeCliente);

}
