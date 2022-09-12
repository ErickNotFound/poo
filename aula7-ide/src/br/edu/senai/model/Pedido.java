package br.edu.senai.model;

import java.time.LocalDate;
import br.edu.senai.enums.Bebida;
import br.edu.senai.enums.Sanduiche;

public class Pedido {

	private LocalDate data;
	private Bebida bebida;
	private Sanduiche sanduiche;

	public Pedido(LocalDate data, Bebida bebida, Sanduiche sanduiche) {
		super();
		this.data = data;
		this.bebida = bebida;
		this.sanduiche = sanduiche;
	}
	
	@Override
	public String toString() {
		return "Data do Pedido: " + data + " || Bebida: " + bebida + " || Sanduiche: " + sanduiche;
	}

	public LocalDate getData() {
		return data;
	}

	public Bebida getBebida() {
		return bebida;
	}

	public Sanduiche getSanduiche() {
		return sanduiche;
	}

	public void imprimirCardapio() {
		for (Bebida bebida : Bebida.values()) {
			System.out.println("\n****************");
			System.out.println(bebida);
		}
		for (Sanduiche sanduiche : sanduiche.values()) {
			System.out.println("\n****************");
			System.out.println(sanduiche);
		}
	}

}
