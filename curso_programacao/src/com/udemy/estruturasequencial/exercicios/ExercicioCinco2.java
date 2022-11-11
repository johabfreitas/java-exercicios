package com.udemy.estruturasequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double precoFinal = 0;

		for (int i = 0; i < 2; i++) {
			int code = scan.nextInt();
			int qtd = scan.nextInt();
			double precoProduct = scan.nextDouble();
			double precoParcial = qtd * precoProduct;

			System.out.println("------------Descricao------------");
			System.out.println(String.format("Codigo produto: %d", code));
			System.out.println(String.format("Quantidade: %d", qtd));
			System.out.println(String.format("SubTotal: %.2f", precoParcial));
			System.out.println("---------------------------------");

			precoFinal += precoParcial;

		}

		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", precoFinal));

		scan.close();

	}

}
