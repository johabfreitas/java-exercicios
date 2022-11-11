package com.udemy.estruturasequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int code1 = scan.nextInt();
		int qtd1 = scan.nextInt();
		double precoProduct1 = scan.nextDouble();
		double precoParcial1 = qtd1 * precoProduct1;
		
		int code2 = scan.nextInt();
		int qtd2 = scan.nextInt();
		double precoProduct2 = scan.nextDouble();
		double precoParcial2 = qtd2 * precoProduct2;
		
		double valorFinal = precoParcial1 + precoParcial2;
		
		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valorFinal));
		
		
		scan.close();

	}

}
