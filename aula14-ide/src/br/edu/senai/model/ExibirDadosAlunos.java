package br.edu.senai.model;

import java.util.function.Consumer;

public class ExibirDadosAlunos implements Consumer<Aluno> {

	@Override
	public void accept(Aluno t) {
		System.out.println("-----Dados do Aluno------");
		System.out.println(t.getNome());
		System.out.println(t.getEmail());
		System.out.println(t.getIdade());
	}
}
