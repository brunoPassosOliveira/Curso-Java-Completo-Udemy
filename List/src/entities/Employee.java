package entities;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		
	}

	public Integer getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public double incSal(double incSal) {
		return salary += salary*incSal/100;
	}
	public String toString() {
		return id +", " + name +", " + String.format("%.2f",salary) ;
	}
	
	
	

		
}