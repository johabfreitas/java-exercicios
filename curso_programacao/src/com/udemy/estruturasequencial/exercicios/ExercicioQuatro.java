package com.udemy.estruturasequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int id = scan.nextInt();
		int hours = scan.nextInt();
		double valueHours = scan.nextDouble();
		double wage = hours * valueHours;
		
		System.out.println(String.format("NUMBER = %d", id));
		System.out.println(String.format("SALARY = U$ %.2f", wage));
		
		scan.close();
		

	}

}
