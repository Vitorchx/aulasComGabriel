import java.util.Scanner;

public class ProdutoSimples {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Integer prodA = scanner.nextInt();
		System.out.println("Valor do produto A: " + prodA);
		
		Integer prodB = scanner.nextInt();
		System.out.println("Valor do prod B: " + prodB);
		
		Integer prod = prodA * prodB;
		
		System.out.print("PROD: " + prod);
		
		scanner.close();
		
		
	}

}
