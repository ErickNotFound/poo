package br.edu.senai.exemplos;

import br.edu.senai.interfaces.Conta;

public class TesteConta {

	public static void main(String[] args) {
		// Classe anonima baseado em uma interface
		Conta conta = new Conta(){

			@Override
			public void transacao() {
				System.out.println("Transação efetuada");
				
			}
			
		};
		conta.transacao();
		// Programação funcional a partir da versão 8
		// Programação funcional é com base em interfaces
		// Para a interface ser funcional só pode ter um metodo abstrato
		// Dentro de () são os argumentos (Parâmetros)
		//O código abaixo representa o da linha 9 a 17
		Conta conta2 = ()-> System.out.println("Transação efetuada");
		conta2.transacao();

	}
}