package br.org.serratec.teste;

import br.org.serratec.model.Caminhao;

public class TesteVeiculo {

	public static void main(String[] args) {
		Caminhao c = new Caminhao("123", "KYO-1234", "azul", 100000., 7000);
		c.calculcarIPVA();
		System.out.println("Valor IPVA: "+c.getValorIPVA());
		System.out.println(c.toString());
		
	}

}
