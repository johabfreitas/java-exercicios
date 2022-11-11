package com.udemy.estruturacondicional.exercicios;

import java.util.Scanner;

public class ExercicioNegativo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		if(numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}
		
		scan.close();

	}

}
