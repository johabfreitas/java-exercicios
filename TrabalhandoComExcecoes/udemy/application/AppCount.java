/*
 *  A correção deste exercício foi feita em uma live no Youtube:
 *	https://www.youtube.com/watch?v=AiIuJqJ0r8A
 *  https://github.com/acenelio/exceptions2-java
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountBanck;
import exceptions.BusinessException;

public class AppCount {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter accout data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		System.out.println();

		AccountBanck count = new AccountBanck(number, holder, balance, withdrawLimit);

		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();

		try {
			count.withdraw(amount);
			System.out.printf("New balance: %.2f", count.getBalance());
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}
