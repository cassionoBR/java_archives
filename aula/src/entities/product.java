package entities;

import java.util.Scanner;

public class product {

		Scanner sc = new Scanner(System.in);
		
		public String name;
		public double value;
		public int quantity;
		
		public double valueTotal() {
			
			return quantity * value;
			
}		
		public void addProduct(int quantity) {
			
			this.quantity += quantity;
		}
		
		public void removeProduct (int quantity) {
			
			this.quantity -= quantity;
		}
		
		public String toString() {
			return name + ", $" + String.format("%.2f", value) + 
					", " + quantity + " units"
					+ ", Total = $" + String.format("%.2f", valueTotal());
		}


}

