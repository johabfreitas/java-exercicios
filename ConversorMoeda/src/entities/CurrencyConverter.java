package entities;

public class CurrencyConverter {
	
	// Método não estático
	public double valuePrice;
	public double manyDollarsBought;
	
	public double valuePay() {
		double valueBought = valuePrice * manyDollarsBought; 
		valueBought += valueBought * 6 / 100;
		return valueBought;	
	}

	// Método estático
	public static double IOF = 0.06;
	
	public static double dollarToReal(double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF);
	}
	
}
