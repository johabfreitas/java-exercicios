package com.udemy.estruturarepetitiva.for_exercicios;

import java.util.Scanner;

public class ExercicioFatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int fat = 1;
		for (int i = 1; i <= n; i++) {
			fat = fat * i;

		}

		System.out.println(fat);

		scan.close();
	}

}
