package application;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int count = 1;
		int posaprovado;
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();

		String[] nomes = new String[n];
		double[] notas1 = new double[n];
		double[] notas2 = new double[n];
		double[] media = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println(String.format("Digite nome, primeira e segunda nota do %do aluno:", count++));
			sc.nextLine();
			nomes[i] = sc.nextLine();
			notas1[i] = sc.nextDouble();
			notas2[i] = sc.nextDouble();
		}

		for (int i = 0; i < n; i++) {
			media[i] = ((notas1[i] + notas2[i]) / 2);
		}

		posaprovado = 0;
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < n; i++) {
			if (media[i] >= 6.0) {
				posaprovado = i;
				System.out.println(nomes[posaprovado]);
			}

		}
		
		/*// Outra forma
		 * double media;
		  for (int i=0; i<n; i++) {
	        media = (notas1[i] + notas2[i]) / 2;

	        if(media >= 6.0) {
	            System.out.printf("%s\n", nomes[i]);
	        }
	    } 
		 
		  
		 */

		sc.close();

	}

}
