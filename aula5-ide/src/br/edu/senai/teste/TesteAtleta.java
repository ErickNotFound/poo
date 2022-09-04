package br.edu.senai.teste;

import br.edu.senai.model.Time;
import br.edu.senai.model.Atleta;

public class TesteAtleta {

	public static void main(String[] args) {
		Atleta a1 = new Atleta("Zé", "Atacante");
		Atleta a2 = new Atleta("Marcos", "Goleiro");
		Atleta a3 = new Atleta("Pedro", "Zagueiro");
		Time time1 = new Time("Flamengo", "Dorival", new Atleta[3]);
		
		
		time1.adicionarAtletas(a1);
		time1.adicionarAtletas(a2);
		time1.adicionarAtletas(a3);

		System.out.println(time1.getNomeTime());
		time1.listarAtletas();

	}

}
