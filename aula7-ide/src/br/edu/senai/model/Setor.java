package br.edu.senai.model;

public class Setor {
	private Integer numero;
	private String discricao;

	public Setor(Integer numero, String discricao) {
		super();
		this.numero = numero;
		this.discricao = discricao;
	}

	@Override
	public String toString() {
		return "Numero: " + numero + " || Discricao: " + discricao;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getDiscricao() {
		return discricao;
	}

}
