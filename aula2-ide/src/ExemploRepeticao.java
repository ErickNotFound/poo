
public class ExemploRepeticao {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("--------------------");
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j <= 10);
		System.out.println("--------------------");
		for (int c = 1; c <= 10; c++) {
			// if (c != 5) {
			if (c >= 5 && c < 6) {
				continue;
			}
			System.out.println(c);
		}
	}
}