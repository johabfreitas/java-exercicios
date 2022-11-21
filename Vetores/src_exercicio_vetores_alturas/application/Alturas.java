package application;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int count = 1;
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println(String.format("Dados da %da pessoa:", count++));
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			sum += altura[i];
		}
		
		System.out.println();
		int qtdMenor = 0;
		double percentual = 0;
		for(int i = 0; i < idade.length; i++) {
			if(idade[i] < 16) {
				qtdMenor++;
			}
			percentual = ((double)qtdMenor / n) * 100;
		}
		
		System.out.println(String.format("Altura media: %.2f", sum / altura.length));
		System.out.println(String.format("Pessoas com menos de 16 anos: %.1f%%", percentual));
		
		for(int i = 0; i < idade.length; i++) {
			if(idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}

}
