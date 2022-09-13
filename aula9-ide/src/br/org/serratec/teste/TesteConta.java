package br.org.serratec.teste;

import br.org.serratec.exception.ContaException;
import br.org.serratec.model.Poupanca;

public class TesteConta {

	public static void main(String[] args) {
		Poupanca p = new Poupanca("Joaquim", 1000.);
		try {
			p.deposito(0.);
		} catch (ContaException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
