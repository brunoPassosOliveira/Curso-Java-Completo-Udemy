package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		System.out.println("Digite os dados do retangulo");
		System.out.print("Width: ");
		System.out.println();
		rect.width = sc.nextDouble();
		System.out.print("Height: ");
		rect.height = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n", rect.area());
		System.out.printf("Perimeter = %.2f%n", rect.perimeter());
		System.out.printf("Area = %.2f%n", rect.diagonal());
		
	
		sc.close();
	}

}
