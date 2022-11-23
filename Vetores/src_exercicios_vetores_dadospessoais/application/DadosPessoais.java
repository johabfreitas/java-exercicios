package application;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoais {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int count1 = 1, count2 = 1, qtdMulheres = 0, qtdHomens = 0;
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		// Entrada de Dados
		for(int i = 0; i < n; i++) {
			System.out.print(String.format("Altura da %da pessoa: ", count1++));
			altura[i] = sc.nextDouble();
			System.out.print(String.format("Genero da %da pessoa: ", count2++));
			genero[i] = sc.next().charAt(0);
		}
		
		// Verificar qual a menor e maior idade
		double menor = altura[0], maior = altura[0];
		for(int i = 0; i < n; i++) {
			if(altura[i] < menor){
				menor = altura[i];				
			}
		}		
		
		for(int i = 0; i < n; i++) {
			if(altura[i] > maior){
				maior = altura[i];				
			}
		}		
		System.out.println("Menor altura = " + menor);
		System.out.println("Maior altura = " + maior);
		
		// Medias das alturas das mulheres
		  double soma = 0.0, media;
		  for (int i = 0; i < n; i++) {
	        if(genero[i] == 'F') {
	            soma += altura[i];
	            qtdMulheres++;
	        }
	    } 
		  media = soma / qtdMulheres;
		  System.out.println(String.format("Media das alturas das mulheres = %.2f", media));
		  
		  // Quantidade de homens
		  for (int i = 0; i < n; i++) {
		        if(genero[i] == 'M') {
		            qtdHomens++;
		        }
		    }
		  
		  System.out.println(String.format("Numero de homens = %d", qtdHomens));
		
		sc.close();

	}

}
