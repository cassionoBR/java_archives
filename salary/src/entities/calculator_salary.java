package entities;

public class calculator_salary {

	public String name;
	public double salary, updateSalary;
	public double tax, netSalary;
	
	public void printInfo() {
		
		netSalary = salary - tax;
		System.out.println("Username: " + name);
		System.out.println("Net salary: " + String.format("%.2f", netSalary));
		
	}
	
	public double increase(double percentage) {
		
		updateSalary = salary + ((salary/100) * percentage);
		return updateSalary;
	}
	
	public void updateInfo () {
		
		double update = updateSalary - tax;
		System.out.println("Updated data: " + name + ", " + String.format("%.2f", update));
	
	}
}
