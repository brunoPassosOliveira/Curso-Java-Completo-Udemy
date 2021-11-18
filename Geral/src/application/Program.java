package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		
		System.out.println("Ensira os dados do Triangulo X");
			x.a= sc.nextDouble();
			x.b= sc.nextDouble();
			x.c= sc.nextDouble();
					
		System.out.println("Ensira os dados do Triangulo Y");
			y.a= sc.nextDouble();
			y.b= sc.nextDouble();
			y.c= sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();

		
		System.out.println("Triangulo X area:" +areaX);
		System.out.println("Triangulo Y area:" +areaY);
		if (areaX > areaY) {
			System.out.println("O Triangulo x tem a area maior.");
		}else {
			System.out.println("O Triangulo Y tem a area maior.");
		}
		
		sc.close();

	}

}
