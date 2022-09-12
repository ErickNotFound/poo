package br.edu.senai.model;

import br.edu.senai.enums.PeriodoCurso;

public class Curso {

	private String nome;
	private PeriodoCurso periodo;

	public Curso(String nome, PeriodoCurso periodo) {
		super();
		this.nome = nome;
		this.periodo = periodo;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " || Periodo: " + periodo;
	}

	public String getNome() {
		return nome;
	}

	public PeriodoCurso getPeriodo() {
		return periodo;
	}

}
