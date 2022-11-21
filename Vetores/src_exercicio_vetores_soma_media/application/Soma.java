package application;

import java.util.Locale;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] notas = new double[n];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Digite um numero: ");
			notas[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		System.out.print("VALORES = ");
		for(int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		double sum = 0.0;
		for(int i = 0; i < notas.length; i++) {
			sum += notas[i];
		}
		System.out.println("SOMA = " + sum);
		System.out.println("MEDIA = " + sum / notas.length);
		
		sc.close();

	}

}
