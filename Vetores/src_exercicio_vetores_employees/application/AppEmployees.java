package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class AppEmployees {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		int count  = 1;
		
		Employees employees = new Employees();
		List<Integer> idList = new ArrayList<>();
		List<String> nameList = new ArrayList<>();
		List<Double> salaryList = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		Employees[] vect = new Employees[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + count++ + ":");
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			employees.setId(id);
			idList.add(id);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			employees.setName(name);
			nameList.add(name);
			
			System.out.print("Salary: ");
			employees.salary = sc.nextDouble();
			salaryList.add(employees.salary);
			
			vect[i] = new Employees(id, name, employees.salary);
		}		
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer searchId = sc.nextInt();
		System.out.print("Enter the percentage: ");
		double p = sc.nextDouble();
		employees.increaseSalary(p);
		
		System.out.println();
		System.out.println("List of employees:");
		//employees = new Employees(employees.id, employees.name, employees.salary);
		//System.out.println(employees);
		
		
		/*
		for (int i = 0; i < n; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
	
		
		for(Integer x : idList){
			System.out.println(x);
		}
	
		for(String y : nameList){
			System.out.println(y);
		}
		
		for(Double z : salaryList){
			System.out.printf("%.2f\n", z);
		}
		*/
		
		
		
		
		sc.close();

	}

}
