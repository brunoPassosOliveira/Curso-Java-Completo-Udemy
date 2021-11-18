package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Vetores2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		Product[] vect = new Product[n];
		double soma = 0.00; 
		
		for(int i=0; i<n; i++) {
			String name = sc.next();
			Double price = sc.nextDouble();
			vect[i] = new Product(name, price);
			soma += vect[i].getPrice();
			
		}
		
		double avg = soma / n;
		System.out.printf("Media dos preços: %.2f", avg);
		
		
		sc.close();
	}

}
