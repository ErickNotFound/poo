package br.edu.senai.model;

public class Seguro {
	private String cobertura;
	private Double valorSeguro;

	public Seguro(String cobertura, Double valorSeguro) {
		super();
		this.cobertura = cobertura;
		this.valorSeguro = valorSeguro;
	}

	@Override
	public String toString() {
		return " || Cobertura: " + cobertura + " || Valor do Seguro:" + valorSeguro;
	}

	public String getCobertura() {
		return cobertura;
	}

	public Double getValorSeguro() {
		return valorSeguro;
	}

}
