package application;

import java.util.*;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle);
		
		/* Outra opção de saída sem o método toString()
		 System.out.printf("AREA = %.2f%n", rect.area());
		 System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		 System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		 */
		
		sc.close();

	}

}
