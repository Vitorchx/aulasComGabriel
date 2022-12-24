import java.util.Scanner;

public class GastoCombustivel {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o tempo gasto na viagem: ");
		Integer TempoGasto = scanner.nextInt();
		
		System.out.println("Digite a velocidade média: ");
		Integer VelocidadeMedia = scanner.nextInt();
		
		Double Kilometros =  (double) (TempoGasto * VelocidadeMedia) ;
		
		Double CombustivelNecessario = Kilometros /12;
		
		System.out.printf("Combustivel necessario pra viagem: " + CombustivelNecessario);
		
		
		scanner.close();
		
	}
}
