package com.udemy.estruturarepetitiva.exercicios;

import java.util.Scanner;

public class ExercicioPreferencia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual o tipo de combustivel: ");
		int tipo = scan.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

			while(tipo != 4) {
				if(tipo == 1) {
					alcool += 1;
				} 
				else if(tipo == 2) {
					gasolina += 1;
				} 
				else if(tipo == 3) {
					diesel += 1;
				}
				else {
					System.out.println("Tipo invalido");
				}
				
				tipo = scan.nextInt();				
			}
			System.out.println("MUITO OBRIGADO");
			System.out.printf("Alcool: %d%n", alcool);
			System.out.printf("Gasolina: %d%n", gasolina);
			System.out.printf("Diesel: %d%n", diesel);
	
	
			
			


		scan.close();

	}

}
