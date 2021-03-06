import java.util.Scanner;
import java.util.Locale;
import entities.calculator;

public class application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		calculator calc = new calculator();
		
		double area, perimeter, diagonal;
		
		System.out.print("Enter retangle base: ");
		calc.b = sc.nextDouble();
		System.out.print("Enter retangle height: ");
		calc.h = sc.nextDouble();
		
		area = calc.area(calc.b, calc.h);
		perimeter = calc.perimeter(calc.b, calc.h);
		diagonal = calc.diagonal(calc.b, calc.h);
		
		System.out.println();
		System.out.println("Result:");
		System.out.println();
		System.out.println("Area = " + String.format("%.2f", area));
		System.out.println("Perimeter = " + String.format("%.2f", perimeter));
		System.out.println("Diagonal = " + String.format("%.2f", diagonal));
		sc.close();		
	}	
}
