import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double num1, num2, num3;
		double TR, CI, TZ, QR, RT, PI;
		
		System.out.println("Enter first number: ");
		num1 = sc.nextDouble();
		System.out.println("Enter secound number: ");
		num2 = sc.nextDouble();
		System.out.println("Enter third number: ");
		num3 = sc.nextDouble();
		
		PI = 3.14159;
		
		TR = (num1 * num3) / 2;
		CI = (num3 * num3) * PI;
		TZ = (num1 + num2) * num3 / 2;
		QR = (num2 * num2);
		RT = (num1 * num2);
		
		System.out.println("Right triangle = " + String.format("%.3f", TR));
		System.out.println("Circle = " + String.format("%.3f", CI));
		System.out.println("Trapeza = " + String.format("%.3f", TZ));
		System.out.println("Square = " + String.format("%.3f", QR));
		System.out.println("Rectangle = " + String.format("%.3f", RT));
		
		sc.close();
		
	}

}
