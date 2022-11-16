package desafios;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String movimentos = sc.nextLine();

		var x = 0;

		var y = 0;

		for (int i = 0; i < movimentos.length(); i++)

		{

			char ch = movimentos.charAt(i);

			if (ch == 'W')

			{

				x++;

			}

			if (ch == 'S')

			{

				x--;

			}

			if (ch == 'D')

			{

				y++;

			}

			if (ch == 'A')

			{

				y--;

			}

		}

		if (x == 0 && y == 0)

		{

			System.out.print("true");

		}

		else

		{

			System.out.print("false");

		}
		
		sc.close();

	}

}
