package br.org.serratec.model;

public class Assistente extends Funcionario {
	private String categoria;

	public Assistente(String nome, String cpf, Double salario, String categoria) {
		super(nome, cpf, salario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}
	
	
}
