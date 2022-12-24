import java.util.Scanner;

public class sequenciaLogica {
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println(i + " " + (i*i) + " " + (i*i*i));
			System.out.println(i + " " + ((i*i)+1) + " " + ((i*i*i)+1));
			
			scanner.close();
		}
	}
}
