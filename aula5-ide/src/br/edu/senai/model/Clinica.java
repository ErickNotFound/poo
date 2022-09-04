package br.edu.senai.model;

public class Clinica extends PlanoDeSaude {

	private String razaoSocial;
	private String cnpj;

	public Clinica(String empresa, String razaoSocial, String cnpj) {
		super(empresa);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "RazaoSocial: " + razaoSocial + " || Cnpj: " + cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

}