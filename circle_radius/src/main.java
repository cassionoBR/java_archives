import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double radius, area, pi;
		
		System.out.println("Radius circle: ");
		radius = sc.nextDouble();
		pi = 3.14159;
		area = pi * (radius * radius);
		
		System.out.println(String.format("%.4f", area));
		
		sc.close();

	}

}
