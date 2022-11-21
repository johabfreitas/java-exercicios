package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class AlturaApp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int count = 1;
		Pessoas pessoa = new Pessoas();
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Pessoas[] pessoas = new Pessoas[n];
		
		
		for(int i = 1; i <= pessoas.length; i++) {
			System.out.println(String.format("Dados da %da pessoa:", count++));
			System.out.print("Nome: ");
			pessoas[i] = sc.next();
			pessoa.setNome(i);
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			pessoa.setIdade(idade);
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			pessoa.setAltura(altura);
			
		}
		
		sc.close();

	}

}
