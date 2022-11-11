package com.udemy.estruturacondicional.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCarrinhoCompra {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int codigo = scan.nextInt();
		int qtd = scan.nextInt();
		double total = 0;
		
		if(codigo == 1) {
			total = qtd * 4.00; //Cachorro quente			
		} else if(codigo == 2) {
			total = qtd * 4.50; //X-Salada
		}else if(codigo == 3) {
			total = qtd * 5.00; //X-Bacon
		}else if(codigo == 4) {
			total = qtd * 2.00; //Torrada simples
		}else if(codigo == 5) {
			total = qtd * 1.50; //Refrigerante
		}else {
			System.out.println("Produto nao encontrado");
		}
		
		System.out.println(String.format("Total: R$ %.2f", total));
		
		scan.close();

	}

}
