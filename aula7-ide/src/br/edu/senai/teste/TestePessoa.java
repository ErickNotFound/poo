package br.edu.senai.teste;

import br.edu.senai.enums.EstadoCivil;
import br.edu.senai.model.Pessoa;
import br.edu.senai.model.Setor;

public class TestePessoa {

	public static void main(String[] args) {
		Setor s1 = new Setor(1, "RH");
		Setor s2 = new Setor(2, "DP");
		
		Pessoa p = new Pessoa("Marcos", "1234", EstadoCivil.CASADO, s1);
		System.out.println("Dados Pessoais:\n" + p);
		
		for (EstadoCivil s : EstadoCivil.values()) {
			System.out.println(s);
		}
	}

}
