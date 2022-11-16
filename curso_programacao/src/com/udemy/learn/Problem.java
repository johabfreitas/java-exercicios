package com.udemy.learn;

import java.util.Locale;
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		int cod1 = leitor.nextInt();
		int n1 = leitor.nextInt();
		double valor1 = leitor.nextDouble();
		
		int cod2 = leitor.nextInt();
		int n2 = leitor.nextInt();
		double valor2 = leitor.nextDouble();

		double total = (n1 * valor1) + (n2 * valor2);
		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));

		leitor.close();

	}

}
