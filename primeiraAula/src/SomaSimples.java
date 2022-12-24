import java.util.Scanner;

public class SomaSimples {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Integer valorA = scanner.nextInt();
		System.out.println("Valor de A: " + valorA);

		Integer valorB = scanner.nextInt();
		System.out.println("Valor de B: " + valorB);

		Integer soma = valorA + valorB;

		System.out.println("SOMA: " + soma);

		scanner.close();

	}

}
 