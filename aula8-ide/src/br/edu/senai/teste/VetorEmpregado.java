package br.edu.senai.teste;

import br.edu.senai.model.Empregado;

public class VetorEmpregado {

	public static void main(String[] args) {
//		Empregado e1 = new Empregado("Lucas", "123456");
//		Empregado e2 = new Empregado("Erick", "124456");
		Empregado[] empregados = new Empregado[3];
		
		empregados[0] = new Empregado("Lucas", "124656");
		empregados[1] = new Empregado("Roni", "143214");
		empregados[2] = new Empregado("Bacon", "43124");
		
				for (Empregado empregado : empregados) {
					System.out.println(empregado);
				}
	}

}
