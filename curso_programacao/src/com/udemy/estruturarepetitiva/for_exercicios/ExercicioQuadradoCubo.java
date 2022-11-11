package com.udemy.estruturarepetitiva.for_exercicios;

import java.util.Scanner;

public class ExercicioQuadradoCubo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			int quadrado = i * i;
			System.out.println(i + " " + quadrado + " " + quadrado * i);

			/**
			 * int primeiro = i; 
			 * int segundo = i * i; 
			 * int terceiro = i * i * i;
			 * System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
			 */
		}

		scan.close();

	}

}
