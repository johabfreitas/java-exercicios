package entities;

public class LegalPerson extends PhysicalPerson {

	private Integer numberEmployee;

	public LegalPerson(String name, Double annualIncome, Double healtExpenses, Integer numberEmployee) {
		super(name, annualIncome, healtExpenses);
		this.numberEmployee = numberEmployee;
	}

	public Integer getNumberEmployee() {
		return numberEmployee;
	}

	public void setNumberEmployee(Integer numberEmployee) {
		this.numberEmployee = numberEmployee;
	}

	@Override
	public double taxCalculation() {
		double tax = 0.0;
		if (numberEmployee > 10) {
			tax = getAnnualIncome() * 0.14;
		} else {
			tax = getAnnualIncome() * 0.16;
		}

		return tax;
	}

}
