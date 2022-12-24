import java.util.Scanner;

public class Area {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		Float valorA = scanner.nextFloat();
		
		System.out.print("Digite o valor de B: ");
		Float valorB = scanner.nextFloat();
		
		System.out.print("Digite o valor de C: ");
		Float valorC = scanner.nextFloat();
		
		Float AreaTriangulo = (valorA * valorC) / 2 ;
		
		Float AreaCirculo =  (float) ((valorC * valorC) * Math.PI) ;
		
		Float AreaTrapezio = ((valorA + valorB) * valorC) /2 ;
		
		Float AreaQuadrado = valorB * valorB;
		
		Float AreaRetangulo = valorA * valorB;
				
				
				
		
		System.out.println("Area Triangulo: " + AreaTriangulo);
		
		System.out.println("Area circulo: " + AreaCirculo) ;
		
		System.out.println("Area Trapézio: " + AreaTrapezio);
		
		System.out.println(" Area Quadrado: " + AreaQuadrado);
		
		System.out.println("Area Retangulo: " + AreaRetangulo);
		
		
		scanner.close();
		
		

	}

}
