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
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Enter number: ");
		int number = sc.nextInt();
		int positionLine = 0;
		int positionColumn = 0;
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == number) {
					positionLine = i;
					positionColumn = j;			
					System.out.println("Position " + positionLine + ", " + positionColumn + ": ");
				}
			}
		}
		
		
		
		sc.close();

	}

}
