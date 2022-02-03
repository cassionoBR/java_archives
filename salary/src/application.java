import java.util.Scanner;
import java.util.Locale;
import entities.calculator_salary;

public class application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		calculator_salary cs = new calculator_salary();
		
		System.out.print("Name: ");
		cs.name = sc.nextLine();
		System.out.print("Gross salary: ");
		cs.salary = sc.nextDouble();
		System.out.println("Tax: ");
		cs.tax = sc.nextDouble();
		
		
		cs.printInfo(); 
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		
		cs.increase(percentage);
		
		cs.updateInfo();
		
		sc.close();
	}

}
