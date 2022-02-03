import java.util.Scanner;
import java.util.Locale;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod;
		double workedH, hoursP, salary;
		
		System.out.println("Employee code: ");
		cod = sc.nextInt();
		System.out.println("Worked hours: ");
		workedH = sc.nextDouble();
		System.out.println("Hour worked price: ");
		hoursP = sc.nextDouble();
		
		salary = workedH * hoursP;
		
		System.out.println("Employee code = " + cod);
		System.out.printf("Salary = $%.2f", salary);
		
		
		sc.close();
		
	}

}
