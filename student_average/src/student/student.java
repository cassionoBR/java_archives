package student;

import java.util.Scanner;



public class student {
	
		Scanner sc = new Scanner(System.in);
	
		public double num1;
		public double num2;
		public double num3;
		public double sumAverage;
		
		public double collector () {
			
			
			System.out.println("Enter first note: ");
			num1 = 0;
			while (num1 == 0) {
				double a = sc.nextDouble();
				if (a <= 30 && a >= 0) {
					num1 = a;
				}
				else {
					System.out.println("ERROR! invalid number. (Max[30]/Min[0])");
					System.out.println("Enter first note: ");
					num1 = 0;
				}
			}
				
			System.out.println("Enter secound note: ");
			num2 = 0;
			while (num2 == 0) {
				double a = sc.nextDouble();
				if (a <= 35 && a >= 0 ) {
					num2 = a;
				}
				else {
					System.out.println("ERROR! invalid number. (Max[35]/Min[0])");
					System.out.println("Enter secound note: ");
					num2 = 0;
				}
			}
			
			System.out.println("Enter third note: ");
			num3 = 0;
			while (num3 == 0) {
				double a = sc.nextDouble();
				if (a <= 35 && a >= 0) {
					num3 = a;
				}
				else {
					System.out.println("ERROR! invalid number. (Max[35]/Min[0])");
					System.out.println("Enter third note: ");
				}
			}

			return sumAverage = (num1 + num2 + num3);
		
	}
		public void resultAverage (double sumAverage) {
			
			if (sumAverage > 60) {
				System.out.println("Final grade = " + sumAverage);
				System.out.println("CONGRATULATION! YOU PASSED.");
			} 
			
			else {
				System.out.println("Final grade = " + sumAverage);
				System.out.println("STUDY MORE! FAILED");
				System.out.println("Missing " + (60 - sumAverage) + "points.");
			}
			
			
			
		}
}
