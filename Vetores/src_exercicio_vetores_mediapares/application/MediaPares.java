package application;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double soma, media;
		int qtdpares;

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] elementos = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			elementos[i] = sc.nextDouble();
		}

		soma = 0.0;
		media = 0.0;
		qtdpares = 0;

		for (int i = 0; i < n; i++) {

			if (elementos[i] % 2 == 0) {
				soma += elementos[i];
				qtdpares++;
			}

		}

		if (qtdpares == 0) {
			System.out.println("NENHUM NUMERO PAR");

		} else {
			media = soma / qtdpares;
			System.out.println("MEDIA DOS PARES = " + media);
		}

		sc.close();

	}

}
