package br.org.serratec.model;

import javax.management.RuntimeErrorException;

public class Poupanca implements Conta {

	private String titular;
	private Double saldo;

	public Poupanca(String titular, Double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Titular: " + titular + " || Saldo: " + saldo;
	}

	@Override
	public Boolean saque(Double valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deposito(Double valor) {
		if (valor > 0) {
			saldo += valor;
			return true;
		}
		throw new RuntimeException("Valor do depósito invalido");
	}

}