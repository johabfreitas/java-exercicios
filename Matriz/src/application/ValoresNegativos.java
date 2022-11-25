package application;

import java.util.Scanner;

public class ValoresNegativos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the size of the array?: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < mat.length; i++) { //Primeiro for percorrer as linhas;
			for(int j = 0; j < mat[i].length; j++) { //Segundo for percorre as colunas;
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal");
		for(int i = 0; i < mat.length; i++) {				
			System.out.println(mat[i][i] + " ");						
		}
		
		int count = 0;
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.print("Negative numbers = " + count);
		
		
		sc.close();

	}

}
