package com.udemy.estruturacondicional.exercicios;

import java.util.Scanner;

public class ExercicioMultiplos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		String saida = (a % b == 0 || b % a == 0 ) ? "Sao Multiplos" : "Nao sao Multiplos"; //Expressão condicional ternária
//		if(a % b == 0 || b % a == 0 ) {
//			System.out.println("Sao Multiplos");
//		} else {
//			System.out.println("Nao sao Multiplos");
//		}
		System.out.println(saida);
		scan.close();

	}

}
