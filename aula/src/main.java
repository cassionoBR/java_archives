import java.util.Scanner;
import java.util.Locale;

import entities.product;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Digite o tamanho do vetor: ");
		int user = sc.nextInt();
		double[] n = new double[user];
		
		for (int i=0; i < user; i++) {
			n[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for (int i=0; i < user; i++) {
			sum += n[i];
		}
		
		double calc = sum / user;
		System.out.println(calc);
			

		sc.close();		
	}	
}
