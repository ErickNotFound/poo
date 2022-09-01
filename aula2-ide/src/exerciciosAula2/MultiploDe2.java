package exerciciosAula2;

import java.util.Scanner;

public class MultiploDe2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int multiplo = 0;
		int sla;
		int nsei;
		
		System.out.print("Entre com um número: ");
		nsei = sc.nextInt();
		
		for (int i = 1; i <= nsei; i++) {
			sla = i % 2;
			if (sla == 0) {
				multiplo +=1;
			}

		}
		System.out.println("Java " + multiplo);
	}

}
