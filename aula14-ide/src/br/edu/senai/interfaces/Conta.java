package br.edu.senai.interfaces;

public interface Conta {
	public void transacao();
	
	
	default void investimento() {
		System.out.println("Você aplicou em um investimento!");
	}
}
