package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employeelist;

public class Programlist {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registred? ");
		int empReg = sc.nextInt();
		Integer id;
		String name;
		double salary;
		int numFunc = 1000; //Pode se implementar funcao para alterar o numero de funcionarios
		Employeelist[] empl = new Employeelist[numFunc];

		
		for (int i=1; i<=empReg;i++) {
			System.out.println("Employee #"+i);
			System.out.print("Id: ");
			id = sc.nextInt();
			while(empl[id] != null) {
				System.out.println("This id already, take again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			name = sc.next();
			sc.nextLine();
			System.out.print("Salary: ");
			salary = sc.nextDouble();

			empl[id] = new Employeelist(id,name,salary);						
		}
		System.out.print("Enter the employee id that will have salary increase: ");
		int empId =sc.nextInt();
		
		
		if(empl[empId] == null) {
			System.out.println("This id does not exist!");

			}else {
				System.out.print("Enter the percentage: ");
				double percIncr = sc.nextDouble();
				//list.get(posId).incSal(percIncr);
				empl[empId].incSal(percIncr);
			}
		System.out.println();
		System.out.println("List of Employees: ");
		for (int i=0;i<empl.length;i++) {
			if(empl[i] != null) {
				System.out.println(empl[i]);
			}
				
			
		}
		
			
		
		
		
		
		sc.close();

	}

}
