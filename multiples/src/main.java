import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Digit two numbers for know if multiples: ");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A > B && A % B == 0) {
			System.out.println("They are multiples!");
		}
		
		else if (B > A && B % A == 0) {
			System.out.println("They are multiples");
		}
		
		else {
			System.out.println("They are not multiples");
		}
		
		sc.close();

	}

}
