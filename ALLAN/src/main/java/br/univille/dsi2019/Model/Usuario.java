package br.univille.dsi2019.Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@MappedSuperclass 
public class Usuario {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long id;
		@Column(length=800)
		@NotNull
		private String nome;
		@NotNull
		private long cpf;
		@Column(length=800)
		@NotNull
		private String email;
		@Column(length=8)
		@NotNull
		@Length(min=2, max=8, message="O tamanho da senha deve ser entre {min} e {max}")
		private String senha;
		@Column(length=800)
		@NotNull
		private String endereco;
		@NotNull
		private int telefone;
		@Column(length=1200)
		private String observacoes;
		@NotNull
		private boolean status;
		
		//@javax.persistence.Temporalporal(value=TemporalType.TIMESTAMP)
		//private Date dataCadastro;
		
		//Getters and Setters
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public long getCpf() {
			return cpf;
		}
		public void setCpf(long cpf) {
			this.cpf = cpf;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public int getTelefone() {
			return telefone;
		}
		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}
		public String getObservacoes() {
			return observacoes;
		}
		public void setObservacoes(String observacoes) {
			this.observacoes = observacoes;
		}
		public boolean isStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
}
