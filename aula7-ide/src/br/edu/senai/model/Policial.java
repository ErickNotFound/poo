package br.edu.senai.model;

//Com o final essa classe não poderá ter filhos
//Imutavél Math
//public final class Policial {
public class Policial {
	private String nome;
	private String matricula;

	public Policial(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	//final no método proibe a sobreescrita
	@Override
	public final String toString() {
		return "Nome: " + nome + " || Matricula: " + matricula;
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

}
