package br.edu.senai.model;

import java.util.Optional;

public class Carro {
	private String marca;
	private String modelo;
	private Optional<Seguro> seguro;

	public Carro(String marca, String modelo, Optional<Seguro> seguro) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.seguro = seguro;
	}

	@Override
	public String toString() {
		return "Marca: " + marca + " || Modelo: " + modelo + " || Seguro: " + seguro;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public Optional<Seguro> getSeguro() {
		return seguro;
	}

}
