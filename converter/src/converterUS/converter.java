package converterUS;

public class converter {
	
	public static final double TAX_IOF = 6;
	
	
	public static double calculator (double price, double valueUS) {
		
		double real = valueUS * price;
		return real + (real/100 * TAX_IOF);
		
	}

}
