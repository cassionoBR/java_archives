import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int product, quantied;
		double total;
		
		System.out.println("Menu:");
		System.out.println();
		System.out.println("1 - Hot-dog = U$4.00");
		System.out.println("2 - X-salad = U$4.50");
		System.out.println("3 - X-bacon = U$5.00");
		System.out.println("4 - Toast   = U$3.00");
		System.out.println("5 - Refri   = U$2.50");
		System.out.println("Your option: ");
		product = sc.nextInt();
		System.out.println("Quantied: ");
		quantied = sc.nextInt();
		
		if (product == 1) {
			total = 4 * quantied;
			System.out.println("Total: " + String.format("%.2f", total));
		}
		else if (product == 2) {
			total = 4.50 * quantied;
			System.out.println("Total: " + String.format("%.2f", total));
		}	
		else if (product == 3) {
			total = 5 * quantied;
			System.out.println("Total: " + String.format("%.2f", total));
		}
		else if (product == 4) {
			total = 3 * quantied;
			System.out.println("Total: " + String.format("%.2f", total));
		}
		else if (product == 5) {
			total = 2.50 * quantied;
			System.out.println("Total: " + String.format("%.2f", total));
		}
		else {
			System.out.println("Error! Incorrect option.");
		}
		sc.close();
	}
}		
