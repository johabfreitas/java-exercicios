package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String date = sc.nextLine();
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine().toUpperCase();
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i + 1) +" item data:" );
			System.out.print("Product name: ");
			String product = sc.nextLine();
			sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int qtd = sc.nextInt();
		}
		
		Product product1 = new Product("TV", 1000.00);
		Product product2 = new Product("Mouse", 40.0);
		OrderItem item1 = new OrderItem(1, 1000.00);
		OrderItem item2 = new OrderItem(2, 40.0);
		Client client = new Client("Alex Green", "alex@gmail.com", sdf.parse("15/03/1985 00:00:00"));
		Order order = new Order(sdf.parse("20/04/2018 11:25:09"), OrderStatus.PROCESSING, client);
		
		System.out.println(order);
		
		sc.close();

	}

}
