package br.org.serratec.model;

public class TotalizaTributos {
	private Double total = 0.0;

	public Double getTotal() {
		return total;
	}
	
	//Quem implememta uma interface também pode utilizar o polimorfismo
	public void totalGeralTributos(Tributacao t) {
		total += t.calcularICM();
		total += t.calcularImpostoDeRenda();
	}
}
