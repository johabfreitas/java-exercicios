package com.udemy.estruturasequencial.exercicios;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		int result = (A*B-C*D);
		
		System.out.println(String.format("DIFERENCA = %d", result));
		
		scan.close();

	}

}
