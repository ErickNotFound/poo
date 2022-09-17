package br.org.serratec.model;

//Herança entre classes
public class Gerente extends Funcionario {
	private String tipo;

	public Gerente(String nome, String cpf, Double salario, String tipo) {
		super(nome, cpf, salario);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

}