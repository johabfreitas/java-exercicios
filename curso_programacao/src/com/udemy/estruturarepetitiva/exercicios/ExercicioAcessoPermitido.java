package com.udemy.estruturarepetitiva.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAcessoPermitido {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int senha = scan.nextInt();
		while(senha != 2002) {
			System.out.println("Senha invalida");
			senha = scan.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		scan.close();

	}

}
