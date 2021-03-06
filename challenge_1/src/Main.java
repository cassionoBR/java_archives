import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		int bedrooms;
		double product;
		
		System.out.println("Whats you name: ");
		//sc.nextLine();
		name = sc.nextLine();
		System.out.println("How many bedrooms have in your house? ");
		bedrooms = sc.nextInt();
		System.out.println("Enter product price: ");
		product = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line): ");
		String last = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println();
		System.out.println("	User information: ");
		System.out.println();
		System.out.println("	Username: " + name);
		System.out.println("	Last username: " + last);
		System.out.println("	User age: " + age);
		System.out.println("	User height: " + String.format("%.2f", height));
		System.out.println("	User bedrooms:" + bedrooms);
		System.out.println("	Product price: " + String.format("%.2f", product));
		
		
		sc.close();
	}	

}
