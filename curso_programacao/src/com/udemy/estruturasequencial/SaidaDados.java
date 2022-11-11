package com.udemy.estruturasequencial;

import java.util.Locale;

public class SaidaDados {

	public static void main(String[] args) {
		
		double x = 10.35784;

		/**
		 * %n quebra a linha
		 * "%.2f"-padrão de máscara de formatação para delimitar
		 * casas decimais
		 */
		System.out.println(String.format("%.2f%n", x));
		System.out.printf(String.format("%.4f%n", x));
		Locale.setDefault(Locale.US);
		System.out.printf(String.format("%.4f%n", x));
	}

}
