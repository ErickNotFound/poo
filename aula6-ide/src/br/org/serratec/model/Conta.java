package br.org.serratec.model;

//Uma interface não pode ter intâncias
//Nçao posso fazer Conta conta = new Conta();
//É uma ofrma de substituir a hereança em algumas coisas
//Toda interface é criada para ter somente assinaturas
//Interfaces não tem implementação

public interface Conta {
	Double taxaBancaria = 2.50;
	
	// Não é necessário colocar abstract porque fica implícito
	public Boolean saque(Double valor);
	
	public Boolean deposito(Double valor);
}
