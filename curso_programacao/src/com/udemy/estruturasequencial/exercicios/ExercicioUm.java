package com.udemy.estruturasequencial.exercicios;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b, s;
		a = scan.nextInt();
		b = scan.nextInt();
		s = a + b;
		
		System.out.println(String.format("SOMA = %d", s));
		
		scan.close();

	}

}
