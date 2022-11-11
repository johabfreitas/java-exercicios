package com.udemy.estruturarepetitiva.for_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMediaPonderada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	
		for(int i = 0; i < n; i++) {
			double nota1 = scan.nextDouble();
			double nota2 = scan.nextDouble();
			double nota3 = scan.nextDouble();
			
			double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
			System.out.printf("%.1f%n",media);
		}
		
		
		
		
		scan.close();

	}

}
