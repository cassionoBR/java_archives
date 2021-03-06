package application;

import intities.registor;
import java.util.Scanner;


public class program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
 		System.out.println("How many rooms will be rented: ");
		int resp = input.nextInt();
		registor[] vect = new registor[10];
		
		System.out.println("Register: ");
		System.out.println();
		
		for (int i = 0; i < resp; i++) {
			
			input.nextLine();
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("Email: ");
			String email = input.nextLine();
			System.out.print("Room: ");
			int room = input.nextInt();
			
			vect[room] = new registor(room, name, email);
		}
		
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < vect.length; i++) {
			
			if (vect[i] != null) {
				System.out.println(vect[i].getRoom()
						+ ": "
						+ vect[i].getName()
						+ ", "
						+ vect[i].getEmail());
				
			}
			
		}
	
		input.close();
	}

}
