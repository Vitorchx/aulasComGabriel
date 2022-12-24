import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite o Valor: ");
		
		Integer A = scanner.nextInt();
		
		int anos = A / 365;
		int meses = (A % 365) /30;
		int dias = (A % 365)% 30;
		
		System.out.println("Anos: " + anos);
		System.out.println("Meses: " + meses);
		System.out.println("Dias: " + dias);
		
		scanner.close();
		
		
	}
	
	
}
