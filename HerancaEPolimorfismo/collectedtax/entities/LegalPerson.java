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

}
