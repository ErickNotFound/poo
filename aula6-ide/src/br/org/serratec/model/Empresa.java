package br.org.serratec.model;

public class Empresa implements Tributacao {
	private String razaoSocial;
	private Double rendimentos;

	public Empresa(String razaoSocial, Double redimentos) {
		super();
		this.razaoSocial = razaoSocial;
		this.rendimentos = redimentos;
	}

	@Override
	public String toString() {
		return "Razão Social: " + razaoSocial + " || Redimentos: " + rendimentos;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public Double getRedimentos() {
		return rendimentos;
	}

	@Override
	public Double calcularImpostoDeRenda() {
		return rendimentos * impostoDeRendaPJ;
	}

	@Override
	public Double calcularICM() {
		return rendimentos * icms;
	}

}
