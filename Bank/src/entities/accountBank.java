package entities;

public class accountBank {
	
	//Atributos
	private int numberCount;
	private String name;
	private double deposit;
	public final double tax = 5.00;
	
	//Construtores
	public accountBank() {
	}
	
	public accountBank(int numberCount, String name) {
		this.numberCount = numberCount;
		this.name = name;
		deposit = 0.00;
	}
	
	//Métodos gets e sets
	public int getNumberCount() {
		return numberCount;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getDeposit() {
		return deposit;
	}
	
	//Métodos
	public int addNumberCount(int numberCount) {
		return this.numberCount = numberCount;
	}
	
	public double addDeposit(double deposito) { 
		return deposit += deposito;
	}
	
	public double remove(double saque) {
		return deposit -= saque + tax;		
	}
	
	public String toString() {
		return "Account "
				+ numberCount
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", deposit);
	}

}
