package br.org.serratec.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.org.serratec.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Marcos", "m@gmail.com", 89);
		Pessoa p2 = new Pessoa("Zarcos", "z@gmail.com", 19);
		Pessoa p3= new Pessoa("Jarcos", "j@gmail.com", 35);
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);

		Collections.sort(pessoas);
		System.out.println(pessoas);
	}

}
