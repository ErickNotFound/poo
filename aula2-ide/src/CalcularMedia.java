import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		
		float valor1 = 3.8f;
		float valor2 = 5.5f;
		float valor3 = 6.7f;
		float valor4 = 9.2f;
		float resultado;
		
		resultado = (valor1+valor2+valor3+valor4)/4;
		int sla = (int)resultado;
		
		System.out.println(sla);
	}

}
