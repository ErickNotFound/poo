package br.edu.senai.listas;

import java.util.ArrayList;
import java.util.List;

import br.edu.senai.model.Empregado;

public class ExemploEmpregado {

	public static void main(String[] args) {
		List<Empregado> empregados = new ArrayList<>();
		
		Empregado empregado1 = new Empregado("Rafael", "6987954");
		Empregado empregado2 = new Empregado("Junior", "4434354");
		Empregado empregado3 = new Empregado("Joseph", "9423154");
		
		empregados.add(empregado1);
		empregados.add(empregado2);
		empregados.add(empregado3);

		for (Empregado empregado : empregados) {
			System.out.println(empregado);
		}
	}
}
