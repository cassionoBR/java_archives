import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int user, A, G, D;
		
		A = G = D = 0;
				
		System.out.println("Fuels:");
		System.out.println("1 - Alcohol."); 
		System.out.println("2 - Gasoline.");
		System.out.println("3 - Diesel.");
		System.out.println("Enter your option: ");
		user = sc.nextInt();
		
		while (user != 4) {
		
			
				if (user == 1) {
					A += 1;
				}
				else if (user == 2) {
					G += 1;
				}
				else if (user == 3) {
					D += 1;
				}
				else if (user > 4){
					System.out.println("Invalid option.");
				}
				System.out.println("Enter your option: ");
				user = sc.nextInt();
		}
		
		System.out.println("Alcohol  = " + A);
		System.out.println("Gasoline = " + G);
		System.out.println("Diesel   = " + D);
		
		sc.close();
	}

}
