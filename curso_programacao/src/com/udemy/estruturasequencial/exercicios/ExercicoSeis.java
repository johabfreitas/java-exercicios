package com.udemy.estruturasequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicoSeis {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();
		
		double areaTriangulo = A * C / 2;
		double areaCirculo = 3.14159 * (Math.pow(C, 2));
		double areaTrapezio = 0.5 * C * (A+B);
		double areaQuadrado = Math.pow(B, 2);
		double areaRetangulo = A * B;
		
		System.out.println(String.format("TRIANGULO: %.3f", areaTriangulo));
		System.out.println(String.format("CIRCULO: %.3f", areaCirculo));
		System.out.println(String.format("TRAPEZIO: %.3f", areaTrapezio));
		System.out.println(String.format("QUADRADO: %.3f", areaQuadrado));
		System.out.println(String.format("RETANGULO: %.3f", areaRetangulo));
		
		
		
		scan.close();

	}

}
