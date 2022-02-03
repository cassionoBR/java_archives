import java.util.Scanner;
import java.util.Locale;


public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code1, code2, quant1, quant2;
		double price1, price2, totalPrice;
		
		System.out.println("First product code: ");
		code1 = sc.nextInt();
		System.out.println("Product quanties: ");
		quant1 = sc.nextInt();
		System.out.print("Product price: ");
		price1 = sc.nextDouble();
		System.out.println("Secound product code: ");
		code2 = sc.nextInt();
		System.out.println("Product quanties: ");
		quant2 = sc.nextInt();
		System.out.println("Product price: ");
		price2 = sc.nextDouble();
		
		double tot1 = quant1 * price1;
		double tot2 = quant2 * price2;
		int totquanties = quant1 + quant2;
		totalPrice = tot1 + tot2;
		
		System.out.println();
		System.out.println("Your shoppings: ");
		System.out.println();
		System.out.println("Products quanties = " + totquanties);
		System.out.println("First product: Qtd. x" + quant1 + " = " + String.format("%.2f", tot1));
		System.out.println("Secound product: Qtd. x" + quant2 + " = " + String.format("%.2f", tot2));
		System.out.printf("Total amount payable = " + String.format("%.2f", totalPrice));
		
		
		sc.close();
		
	}

}
