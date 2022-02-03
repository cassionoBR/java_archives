package modulos;

import java.util.Scanner;

public class product {

		Scanner sc = new Scanner(System.in);
		
		private String name;
		private double value;
		private int quantity;
		
		public product(String name, double value, int quantity) {
			
			this.name = name;
			this.value = value;
			this.quantity = quantity;
		}
		
		public product(String name, double value) {
			this.name = name;
			this.value = value;
		}
		
		public String getName() {    
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
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
