package com.udemy.estruturacondicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioContaTelefone {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int minutosUtilizados = scan.nextInt();
		double conta = 50.0;
		if (minutosUtilizados > 100) {
			conta += (minutosUtilizados - 100) * 2;
		}

		System.out.printf("Valor a pagar:R$%.2f%n", conta);

		scan.close();
	}

}
