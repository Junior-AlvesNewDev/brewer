package com.algaworks.brewer.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Usuario {
	@NotBlank(message = "Nome é obrigatório")
	private String nome;
	
	private String email;
	
	private String datanascimento;
	
	@Size(min = 1, max = 8, message = "A quantidade de caracteres da senha deve estar entre 1 e 8")
	private Double senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}

	public Double getSenha() {
		return senha;
	}

	public void setSenha(Double senha) {
		this.senha = senha;
	}
	
	
}
