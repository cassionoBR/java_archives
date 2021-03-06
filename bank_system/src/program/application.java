package program;

import java.util.Scanner;
import java.util.Locale;
import utils.modBank;

public class application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String name;
		int cod;
		char user, userM, Y, N;
	
		System.out.println("Welcome The Bank ONB");
		System.out.print("Enter account number: ");
		cod = input.nextInt();
		input.nextLine();
		System.out.print("Enter account holder: ");
		name = input.nextLine();
		modBank cadastro = new modBank(cod, name);
		
		System.out.print("Is there na initial deposit (y/n)? ");
		user = input.next().charAt(0);
		userM = Character.toUpperCase(user);
		Y = 'Y';
		if (userM == Y) {
			System.out.print("Enter a deposit value: ");
			cadastro.deposit();
		}
		System.out.println("Account data:");
		System.out.println(cadastro.toString());
		
		System.out.print("Enter a deposit value: ");
		cadastro.deposit();
		System.out.println("Update account data:");
		System.out.println(cadastro.toString());
		
		System.out.print("Enter a withdraw value: ");
		cadastro.withdraw();
		System.out.println(cadastro.toString());
	
		input.close();
	}

}
