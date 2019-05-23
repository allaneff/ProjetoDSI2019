package br.univille.dsi2019.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;



@Entity
public class Profissional extends Usuario{
	
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.REFRESH})
	private TipoProfissional tipoProfissional;
}
