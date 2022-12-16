package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Informe sua idade: ");
			int idade = sc.nextInt();

			System.out.println("Sua idade é " + idade);
		} catch (InputMismatchException e) {
			System.out.println("Formato invalido!");
		}

		sc.close();

	}

}