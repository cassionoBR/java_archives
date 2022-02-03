package entities;

public class calculator {

	public double b;
	public double h;
	
	public double area (double b, double h) {
		
		return b * h;
	}
	
	public double perimeter (double b, double h) {
		
		return (b + h) * 2;
	}
	
	public double diagonal (double b, double h) {
		
		return Math.sqrt((b * b) + (h * h));
	}
	
}
