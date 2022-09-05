package br.org.serratec.teste;

import br.org.serratec.model.Apartamento;
import br.org.serratec.model.Casa;
import br.org.serratec.model.Proprietario;

public class TesteImovel {

	public static void main(String[] args) {
		
		Proprietario proprietario1 = new Proprietario("Marcos");
		Casa casa1 = new Casa("Centro", 400700., true);
		Apartamento apartamento1 = new Apartamento("Centro", 600000., 4);
		
		casa1.setProprietario(proprietario1);
		apartamento1.setProprietario(proprietario1);
		
		System.out.println("Dados do Imovél:\n" + casa1 + " || Nome do proprietário: " + casa1.getProprietario().getNome());
		System.out.println("\nDados do Imovél:\n" + apartamento1 + " || Nome do proprietário: " + apartamento1.getProprietario().getNome());
	}

}
