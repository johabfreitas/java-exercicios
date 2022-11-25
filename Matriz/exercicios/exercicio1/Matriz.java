package exercicio1;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter lines numbers: ");
		int m = sc.nextInt();
		System.out.print("Enter column numbers: ");
		int n = sc.nextInt();
		int[][] mat = new int[m][n];

		System.out.println("Enter with numbers");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.print("Enter number: ");
		int number = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == number) {
					
					System.out.println("Position " + i + "," + j + ":");
					
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}

					/*
					System.out.println("Left: " + mat[positionLine][positionColumn - 1]);
					System.out.println("Right: " + mat[positionLine][positionColumn + 1]);
					System.out.println("Up: " + mat[positionLine - 1][positionColumn]);
					System.out.println("Down: " + mat[positionLine + 1][positionColumn]);
					*/
					
				} 
			}
		}

		sc.close();

	}

}
