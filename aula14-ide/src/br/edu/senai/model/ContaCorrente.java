package br.edu.senai.model;

import br.edu.senai.interfaces.Conta;

public class ContaCorrente implements Conta {

	@Override
	public void transacao() {
		System.out.println("Transação Ok!");

	}

}
