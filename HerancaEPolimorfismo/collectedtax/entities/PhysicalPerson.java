package entities;

public class PhysicalPerson {

	private String name;
	private Double annualIncome;
	private Double healtExpenses;

	public PhysicalPerson() {
	}

	public PhysicalPerson(String name, Double annualIncome, Double healtExpenses) {
		super();
		this.name = name;
		this.annualIncome = annualIncome;
		this.healtExpenses = healtExpenses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public Double getHealtExpenses() {
		return healtExpenses;
	}

	public void setHealtExpenses(Double healtExpenses) {
		this.healtExpenses = healtExpenses;
	}

	public double taxCalculation() {
		double tax = 0.0;
		if (annualIncome < 20000.00) {
			tax = (getAnnualIncome() * 0.15) - (getHealtExpenses() * 0.50);
		} 
		else if(annualIncome > 20000.00){
			tax = (getAnnualIncome() * 0.25) - (getHealtExpenses() * 0.50);
		}

		return tax;
	}

}
