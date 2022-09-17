package br.org.serratec.teste;

import br.org.serratec.model.Assistente;
import br.org.serratec.model.Gerente;

public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Marcelo", "12345678", 5000., "Financeiro");
		System.out.println("Dados: " + gerente.getNome() + "\n" + gerente.getSalario());
		Assistente assistente = new Assistente("Lucas", "1232342", 12000., "Ti");
		System.out.println("Dados: " + assistente.getNome() + "\n" + gerente.getSalario());
	}

}
