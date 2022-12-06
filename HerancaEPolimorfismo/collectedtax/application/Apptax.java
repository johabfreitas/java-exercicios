package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.PhysicalPerson;

public class Apptax {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<PhysicalPerson> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double annualIncome = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double healtExpenses = sc.nextDouble();
				list.add(new PhysicalPerson(name, annualIncome, healtExpenses));
			} else {
				System.out.print("Number of employees: ");
				int numberEmployee = sc.nextInt();
				list.add(new LegalPerson(name, annualIncome, 0.0, numberEmployee));
			}
			
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0.0;
		for(PhysicalPerson person : list) {
			System.out.println(String.format("%s: $ %.2f", person.getName(), person.taxCalculation()));
			sum += person.taxCalculation();
		}
		
		System.out.println();
		System.out.println(String.format("TOTAL TAXES: $ %.2f", sum));
		sc.close();
	}

}
