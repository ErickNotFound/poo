package br.edu.senai.exemplos;

import br.edu.senai.interfaces.Calculo;

public class TesteCalculo {

	public static void main(String[] args) {
		
		Calculo calculo = new Calculo() {
			
			@Override
			public int operacao(int a, int b) {
				return a+b;
			}
		};
		System.out.println(calculo.operacao(10, 30));
		
		Calculo calculo2 = (a, b)->a+b;
		System.out.println(calculo2.operacao(10, 30));
	}

}
