package com.udemy.estruturasequencial;

import java.util.Locale;

public class ExercicioFixacao {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.println(String.format("%s, which price is $ %.2f", product1,price1));
		System.out.println(String.format("%s, which price is $ %.2f%n", product2,price2));
		System.out.println(String.format("Record: %d years old, code %d and gender: %c%n", age,code,gender));
		System.out.println(String.format("Measue with eight decimal places: %f00", measure));
		System.out.println(String.format("Rouded (three decimal places): %.3f", measure));
		Locale.setDefault(Locale.US);
		System.out.println(String.format("US decimal point: %.3f", measure));

	}

}
