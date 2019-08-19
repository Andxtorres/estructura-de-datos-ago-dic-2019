import java.util.Scanner;

import shapes.Circle;
import shapes.Shape;
import shapes.Square;

public class Main {
	
	public static void main(String args[]) {
		System.out.println("In code we trust");
		Scanner sc= new Scanner(System.in);
		String selectedOption= preguntarFigura(sc);
		while(!selectedOption.equals("0")){


			Shape shape;
			switch(selectedOption) {
				case "1":
					System.out.println("Dame el lado del cuadrado: ");
					double side= sc.nextDouble();
					shape= new Square(side);
					break;
				case "2":
					System.out.println("Dame el radio del círculo");
					double radius=sc.nextDouble();
					shape=new Circle(radius);
					break;
				default:
					System.out.println("Dame el lado del cuadrado: ");
					double sideD= sc.nextDouble();				
					shape=new Square(sideD);
					break;
			}
			sc.nextLine();
			System.out.println("¿Qué deseas calcular? 1) Área 2)Perímetro");
			String selectedCalculation= sc.nextLine();
			switch(selectedCalculation) {
				case "1":
					System.out.println("Resultado: "+shape.calculateArea());
					break;
				case "2":
					System.out.println("Resultado: "+shape.calculatePerimeter());
					break;
			}
			selectedOption= preguntarFigura(sc);
			
		}
		sc.close();
		
	}
	
	public static String preguntarFigura(Scanner sc) {
		System.out.println("Elige la figura: 1)Cuadrado 2)Círculo");
		String selectedOption="1";
		selectedOption=sc.nextLine();
		return selectedOption;
	}
}
