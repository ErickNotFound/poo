public class ExemploOperadores {

	public static void main(String[] args) {
		//Um atleta poderaá participar de uma maratona sao
		//a idade seja superior a 18 ou altura maior ou igual a 1.80
		int idade = 19;
		double altura = 1.60;
		
		if (idade > 18 || altura >= 1.80) {
			System.out.println("Competirá");
		}else {
			System.out.println("Não Competirá");
		}
		
		//Ternário
		String resposta = idade > 18 || altura >= 1.80 ? "Competirá":"Não Competirá";
		System.out.println(resposta);
	}

}