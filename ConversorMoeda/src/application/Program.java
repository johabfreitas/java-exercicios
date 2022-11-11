package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * // Instanciando um objeto não estático CurrencyConverter cc = new
		 * CurrencyConverter(); System.out.print("What is the dollar price? ");
		 * cc.valuePrice = sc.nextDouble();
		 * System.out.print("How many dollars will be bought? "); cc.manyDollarsBought =
		 * sc.nextDouble(); System.out.printf("Amount to be paid in reais = %.2f",
		 * cc.valuePay());
		 */

		// Declarando uma classe com objeto estático
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);

		sc.close();

	}

}
