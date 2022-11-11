package com.udemy.estruturacondicional.exercicios;

import java.util.Scanner;

public class ExercicioParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		if(numero % 2 == 0){
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		scan.close();

	}

}
