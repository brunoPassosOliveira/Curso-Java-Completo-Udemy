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
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Client Data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date: ");
		Date birthDate = sdf.parse(sc.next());
		Date moment = new Date();
		Order order = new Order(moment, OrderStatus.PROCESSING, new Client(name,email,birthDate));
		
		System.out.println();
		System.out.println("Enter order data: ");
		System.out.println(order.getStatus());
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for(int i=1;i<=	n;i++) {
			sc.nextLine();
			System.out.println("Enter #" +i +" item data: ");
			System.out.print("Product name: ");
			String pName = sc.nextLine();
			System.out.print("Product price: ");
			Double pPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int pQuantity = sc.nextInt();
			
			OrderItem item = new OrderItem(pQuantity,pPrice, new Product(pName, pPrice));
			order.addItem(item);
		}
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);
		
		sc.close();
	}

}
