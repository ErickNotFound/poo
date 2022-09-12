package br.edu.senai.model;

import br.edu.senai.enums.EstadoCivil;

public class Pessoa {

	private String nome;
	private String telefone;
	private EstadoCivil estadocivil;
	private Setor setor;

	public Pessoa(String nome, String telefone, EstadoCivil estadocivil, Setor setor) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.estadocivil = estadocivil;
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " || Telefone: " + telefone + " || estadocivil: " + estadocivil + " || Setor: " + setor;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public EstadoCivil getEstadocivil() {
		return estadocivil;
	}

	public Setor getSetor() {
		return setor;
	}

}
