package br.univille.dsi2019.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Administrador{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
}
