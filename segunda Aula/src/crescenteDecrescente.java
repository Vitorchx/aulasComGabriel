import java.util.Scanner;

public class crescenteDecrescente {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		int y = scanner.nextInt();
		while (x != y) {

			if (x > y)
				System.out.println("Decrescente");
			else
				System.out.println("Crescente");

			x = scanner.nextInt();
			y = scanner.nextInt();
			
			scanner.close();

		}

	}
}
