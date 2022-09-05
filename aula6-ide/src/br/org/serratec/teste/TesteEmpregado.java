package br.org.serratec.teste;

import br.org.serratec.model.Assistente;
import br.org.serratec.model.Diretor;
import br.org.serratec.model.Gerente;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		Assistente assitente1 = new Assistente("1234", "José", 2500., 100.);
		Gerente gerente1 = new Gerente("12345", "Maria", 4500., "financeiro");
		Diretor diretor1 = new Diretor("321", "Ana", 9600., "CIO");
		
		assitente1.aumentarSalario();
		gerente1.aumentarSalario();
		diretor1.aumentarSalario();
		
		System.out.println(assitente1);
		System.out.println(gerente1);
		System.out.println(diretor1);
		
	}

}
