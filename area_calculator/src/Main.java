import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area, perimetro, diagonal;
		
		System.out.print("Base do retângulo: ");
		base = sc.nextDouble();
		System.out.print("Altura do retângulo: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		perimetro = (base + altura) * 2;
		diagonal = Math.sqrt((base * base) + (altura * altura));
		
		System.out.println("Base: " + String.format("%.1f", base));
		System.out.println("Altura: " + String.format("%.1f", altura));
		System.out.println("Área: " + String.format("%.4f", area));
		System.out.println("Perímetro: " + String.format("%.4f", perimetro));
		System.out.println("Diagonal: " + String.format("%.4f", diagonal));

		sc.close();
		
	}

}
