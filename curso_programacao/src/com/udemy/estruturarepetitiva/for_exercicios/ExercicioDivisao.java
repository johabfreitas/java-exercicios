package com.udemy.estruturarepetitiva.for_exercicios;

import java.util.Scanner;

public class ExercicioDivisao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();

			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				double s = (double)x / y;
				System.out.printf("%.1f%n", s);
			}

		}

		scan.close();
	}

}
