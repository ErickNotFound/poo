package br.edu.senai.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import br.edu.senai.model.Aluno;
import br.edu.senai.model.ExibirDadosAlunos;

public class TesteAluno {

	public static void main(String[] args) {
		List<Aluno> alunos = Arrays.asList(new Aluno("Joseph", "j@gmail.com", 65),
				new Aluno("Jolyne", "jo@gmail.com", 20));

//		for (Aluno aluno : alunos) {
//			System.out.println(aluno);
//		}
//	ExibirDadosAlunos exibirDadosAlunos= new ExibirDadosAlunos();
//
//		Consumer<Aluno> consumer = new Consumer<Aluno>() {
//
//			@Override
//			public void accept(Aluno t) {
//				System.out.println("-----Dados do Aluno------");
//				System.out.println(t.getNome());
//				System.out.println(t.getEmail());
//				System.out.println(t.getIdade());
//
//			}
//		};
//		Consumer<Aluno> exibirDadosAluno =  consumer;
//		alunos.forEach(exibirDadosAluno);
		
		alunos.forEach(t ->{
			System.out.println("---For Each---");
			System.out.println(t.getNome());
			System.out.println(t.getEmail());
		});
	}

}
