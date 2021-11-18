package application;

import java.util.Locale;
import java.util.Scanner;

public class Vetores1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		double soma = 0.00;
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		double avg = soma / n;
		System.out.printf("Average Height; %.2f", avg);

		sc.close();

	}

}
