package application;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int count = 1;
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println(String.format("Dados da %da pessoa:", count++));
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}

		int posmaior = 0;
		int maior = idade[0];

		for (int i = 0; i < n; i++) {
			if (idade[i] > maior) {
				maior = idade[i];
				posmaior = i;
			}
		}

		System.out.printf("PESSOA MAIS VELHA: %s\n", nome[posmaior]);

		sc.close();

	}

}
