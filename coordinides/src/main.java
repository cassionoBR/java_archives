import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double x, y;
		
		System.out.println("Plan:");
		System.out.println("      y");
		System.out.println("  Q2 | Q1 ");
		System.out.println(" ____|____x");
		System.out.println("     | ");
		System.out.println("  Q3 | Q4");
		System.out.println("Enter axle X: ");
		x = sc.nextDouble();
		System.out.println("Enter axle Y: ");
		y = sc.nextDouble();
		

		if (x > 0 && y > 0) {
			System.out.println("Quadrant Q1!");
		}
		
		else if (x > 0 && y < 0){
			System.out.println("Quadrant Q4!");
		}
		
		else if (x < 0 && y > 0) {
			System.out.println("Quadrant Q2!");
		}
		else if (x == 0 && y == 0) {
			System.out.println("Origin point!");
		}
		else {
			System.out.println("Quadrant Q3!");
		}
		
		sc.close();
	}

}
