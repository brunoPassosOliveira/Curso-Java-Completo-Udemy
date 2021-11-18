package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registred? ");
		int empReg = sc.nextInt();
		Integer id;
		String name;
		double salary;
		List<Employee>list = new ArrayList<>();
		
		for (int i=1; i<=empReg;i++) {
			System.out.println("Employee #"+i);
			System.out.print("Id: ");
			id = sc.nextInt();
			while(searchId(list, id) != null) {
				System.out.println("This id already, take again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			name = sc.next();
			sc.nextLine();
			System.out.print("Salary: ");
			salary = sc.nextDouble();

			list.add(new Employee(id, name,salary));						
		}
		System.out.print("Enter the employee id that will have salary increase");
		int empId =sc.nextInt();
		
		Employee empl = list.stream().filter(x -> x.getId() == empId).findFirst().orElse(null);
		
		
		//Integer posId = searchId(list, empId);
		
		if(empl == null) {
			System.out.println("This id does not exist!");

			}else {
				System.out.print("Enter the percentage: ");
				double percIncr = sc.nextDouble();
				//list.get(posId).incSal(percIncr);
				empl.incSal(percIncr);
			}
		System.out.println();
		System.out.println("List of Employees: ");
		for (Employee emp: list) {
			System.out.println(emp);
		}
		
			
		
		sc.close();
	}
	public static Integer searchId(List<Employee> list, int id) {
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getId()== id) {
				return i;
			}
			}
		return null;
	}

}
