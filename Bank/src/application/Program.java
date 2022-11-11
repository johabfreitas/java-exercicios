/**
 * Correção https://github.com/acenelio/encapsulation1-java
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.accountBank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		accountBank count = new accountBank();
		
		System.out.print("Enter account number: ");
		int numberCount = sc.nextInt();
		count.addNumberCount(numberCount);
		
		System.out.print("Enter account holder: ");
		String name = sc.next();
		count.setName(name);
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char optional = sc.next().charAt(0);
		if(optional == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposito = sc.nextDouble();
			count.addDeposit(deposito);
		} else {
			accountBank count1 = new accountBank(numberCount, name);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", count.getNumberCount(), count.getName(), count.getDeposit());
		
		System.out.println();
		System.out.printf("Enter a deposit value: ");
		double deposito1 = sc.nextDouble();
		count.addDeposit(deposito1);
		System.out.println("Updated account data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", count.getNumberCount(), count.getName(), count.getDeposit());
		
		System.out.println();
		System.out.printf("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		count.remove(saque);
		System.out.println("Updated account data:");
		//System.out.printf("Account %d, Holder: %s, Balance: $ %.2f", count.getNumberCount(), count.getName(), count.getDeposit());
		System.out.println(count);
		sc.close();

	}

}
