package entities;

public class Student {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public void resultFinal() {

		double result = nota1 + nota2 + nota3;

		if (result > 60) {
			System.out.printf("FINAL GRADE = %.2f%n", result);
			System.out.println("PASS");
		} else {
			System.out.printf("FINAL GRADE = %.2f%n", result);
			System.out.println("FAILED");
			double missing = 60 - result;
			System.out.printf("MISSING %.2f POINTS", missing);
		}

	}

}
