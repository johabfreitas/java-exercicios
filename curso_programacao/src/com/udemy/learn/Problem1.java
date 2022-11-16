/*
 Desafio
Faça um programa que leia um valor T e preencha um vetor N[1000] 
com a sequência de valores de 0 até T-1 repetidas vezes, 
conforme exemplo abaixo. Imprima o vetor N.

Entrada
A entrada contém um valor inteiro T (2 ≤ T ≤ 50).

Saída
Para cada posição do vetor, escreva "N[i] = x", 
onde i é a posição do vetor e x é o valor armazenado naquela posição.
 */

package com.udemy.learn;

import java.util.Locale;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		int t = leitor.nextInt();
		int pos = 0;
		int[] N = new int[1000];

		for (int i = 0; i < N.length; i++) {
			for (int j = 0; j < t; j++) {
				if (pos <= 999) {
					System.out.println("N[" + pos + "] = " + j);
					pos++;
				}

			}

		}

		leitor.close();

	}

}
