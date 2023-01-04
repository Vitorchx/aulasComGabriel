import java.util.Scanner;

public class Diferença {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		Integer valorA = scanner.nextInt();
		
		System.out.print("Digite o valor de B: ");
		Integer valorB = scanner.nextInt();
		
		System.out.print("Digite o valor de C: ");
		Integer valorC = scanner.nextInt();
		
		System.out.print("Digite o valor de D: ");
		Integer valorD = scanner.nextInt();
		
		Integer diferença = (valorA * valorB - valorC * valorD);
		
		System.out.println("Diferença: " + diferença);
		
		scanner.close();
	}

}
