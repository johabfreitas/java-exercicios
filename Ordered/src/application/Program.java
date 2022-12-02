package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String clientEmail = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date clientDateBirth = sdf.parse(sc.nextLine());
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine().toUpperCase();
		Date dateMoment = new Date();
		
		Order order = new Order(dateMoment, OrderStatus.valueOf(status), new Client(clientName, clientEmail, clientDateBirth));
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i +" item data:" );
			System.out.print("Product name: ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product =  new Product(name, price);
			list.add(product);
			OrderItem item = new OrderItem(quantity, price);
			order.addItem(item);		
		}

		System.out.println(order);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(String.format("%.2f", list.get(i)));
		}
			
		System.out.println(String.format("%s, $.2%f, Quantity: %d, Subtotal: $.2%f", args)); 
		System.out.println(String.format("%s, $.2%f, Quantity: %d, Subtotal: $.2%f", args)); 
		System.out.println(String.format("Total price: $.2%f", args)); 
		
		sc.close();

	}

}
