package com.udemy.estruturarepetitiva.for_exercicios;

import java.util.Scanner;

public class ExercicioIntervalo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int in = 0;
		int out = 0;
		
		for(int i = 0; i < n; i++) {
			int x = scan.nextInt();
			if(x >= 10 && x <= 20){
				in = in + 1;
			}else {
				out = out + 1;
			}
		}
		
		System.out.printf("%d in%n", in);
		System.out.printf("%d out", out);
		
		
		scan.close();

	}

}
