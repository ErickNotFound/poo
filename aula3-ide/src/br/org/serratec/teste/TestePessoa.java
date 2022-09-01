package br.org.serratec.teste;

import br.org.serratec.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setCodigo(1);
		pessoa1.setNome("Pedro");
		pessoa1.setPeso(60.0);
		pessoa1.setAltura(1.72);
		
		new Pessoa();
		Pessoa pessoa2 = new Pessoa(2, "Maria", 80.1, 1.75);
		
		Pessoa pessoa3 = new Pessoa();
		
		System.out.println("Sua situação é: " + pessoa1.resultadoIMC());
		System.out.println("Sua situação é: " + pessoa2.resultadoIMC());
		
	}

}
