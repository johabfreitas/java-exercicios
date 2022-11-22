package application;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] notas = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			notas[i] = sc.nextDouble();
		}

		System.out.println();
		double sum = 0.0;
		double result = 0.0;
		for (int i = 0; i < n; i++) {
			sum += notas[i];
			result = sum / n;
		}

		System.out.printf("MEDIA DO VETOR = %.3f\n", result);

		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < n; i++) {
			if (notas[i] < result) {
				System.out.println(notas[i]);
			}

		}

		sc.close();

	}

}
