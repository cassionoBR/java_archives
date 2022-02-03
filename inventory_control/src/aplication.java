import java.util.Scanner;
import java.util.Locale;
import modulos.product;

public class aplication {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		System.out.print("Value: ");
		double value = sc.nextDouble();
		
		product produto = new product(name, value, quantity);
		
		System.out.println("Product data: " + produto);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int add = sc.nextInt();
		produto.addProduct(add);
		System.out.println("Update data: " + produto);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		int remove = sc.nextInt();
		produto.removeProduct(remove);
		
		System.out.println();
		System.out.println("Update data: " + produto);
		
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		sc.nextLine();
		String name2 = sc.nextLine();
		System.out.print("Value: ");
		double value2 = sc.nextDouble();
		
		product prod = new product(name2, value2);
		
		System.out.println("Product data: " + prod);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int add2 = sc.nextInt();
		prod.addProduct(add2);
		System.out.println("Update data: " + prod);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		int remove2 = sc.nextInt();
		prod.removeProduct(remove2);
		
		System.out.println();
		System.out.println("Update data: " + prod);
		
		
		sc.close();		
	}	
}
