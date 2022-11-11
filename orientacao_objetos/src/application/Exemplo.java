package application;

import java.util.Scanner;

import entities.ExemploClass;

public class Exemplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ExemploClass classe = new ExemploClass();
		
		System.out.println("Entre com um inteiro: ");
		classe.num = sc.nextInt();
		
		
		classe.incrementa();
		
		sc.close();
	}

}
