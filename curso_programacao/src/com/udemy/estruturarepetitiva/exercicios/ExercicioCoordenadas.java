package com.udemy.estruturarepetitiva.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCoordenadas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();

		while (x != 0.0 && y != 0.0) {

			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
			}

			x = scan.nextDouble();
			y = scan.nextDouble();

		}

		scan.close();

	}

}
