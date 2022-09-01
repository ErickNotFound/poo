package exerciciosAula2;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int par = 0;
		int impar = 0;
		System.out.println("Qual número você quer?");
		numero = sc.nextInt();
		
		for (int i = 0; i <= numero ; i++) {
			if (i % 2 == 0) {
				par += 1;
			}else {
				impar += 1;
			}
		}
		System.out.printf("%s números pares e %s números impares", par, impar);
	}

}
