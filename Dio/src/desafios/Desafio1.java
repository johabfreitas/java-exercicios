// TODO: Implemente uma condição onde seja possível reduzir o número até 0:

package desafios;

import java.util.Locale;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int step = 0;

		while (x != 0) {
			if (x % 2 == 0) {
				x = x / 2;
				++step;
			} else {
				x = x - 1;
				++step;
			}
		}

		System.out.println(step);
		sc.close();
	}
}
