import java.util.Scanner;

public class numerosPositivos {
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        int cont = 0;
	        for (int i=0; i < 6; i++) {
	        	double n = scanner.nextDouble();
	        	if (n > 0) cont++;
	        }
	        System.out.println(cont + " valores positivos");
	        
	        scanner.close();
		
	}

}
