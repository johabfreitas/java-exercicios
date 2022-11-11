package com.udemy.estruturasequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double pi = 3.14159;
		double raio = scan.nextDouble();
		double area = pi*(Math.pow(raio, 2));
		
		System.out.println(String.format("A=%.4f", area));
		
		scan.close();

	}

}
