package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.println("Dados do Funcionario");
		System.out.print("Name: ");
		emp.name = sc.next();
		System.out.print("Gloss Salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println("Employee: " +emp);
		
		System.out.println();
		System.out.println("Which percentage to increase salary?");
		double incr = sc.nextDouble();
		
		emp.increaseSalary(incr);
		
		System.out.println("Update data: " +emp);
		
		sc.close();

	}

}
