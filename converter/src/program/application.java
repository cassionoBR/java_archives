package program;

import java.util.Scanner;
import java.util.Locale;
import converterUS.converter;

public class application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double priceUS = input.nextDouble();
		System.out.println("How many dollars wiil be bought? ");
		double buyDoll = input.nextDouble();
		
		double conv = converter.calculator(priceUS, buyDoll);
		
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", conv));
		
		input.close();

	}

}
