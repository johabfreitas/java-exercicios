package com.udemy.estruturacondicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioIntervalo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double numero = scan.nextDouble();

		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora do intervalo");
		} else if (numero <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (numero <= 50) {
			System.out.println("Intervalo [25,50]");
		} else if (numero <= 75) {
			System.out.println("Intervalo [50,75]");
		} else {
			System.out.println("Intervalo [75,100]");
		}

		scan.close();

	}

}
