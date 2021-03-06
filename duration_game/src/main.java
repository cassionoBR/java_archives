import java.util.Scanner;
import java.util.Locale;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int start, end, duration, day;
		
		System.out.println("Beginning of the game: ");
		start = sc.nextInt();
		System.out.println("End of the game: ");
		end = sc.nextInt();
		
		if (end > start) {
			duration = end - start;
		}
		
		else {
			duration = 24 - (start - end);
		}
		
		System.out.println("Game duration = " + duration + " hours.");
		
		sc.close();

	}

}
