package com.udemy.estruturarepetitiva.for_exercicios;

import java.util.Scanner;

public class ExercicioImpares {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();

		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		scan.close();

	}

}
