package utils;

import java.util.Scanner;

public class modBank {

	Scanner input = new Scanner(System.in);
	
	private int cod;
	private String name;
	private double balance;
	private double withdraw;
	private double deposit;
	
	
	public modBank(int cod, String name) {
		this.cod = cod;
		this.name = name;
		
	}
	
	public double getBalance() {
		return balance;
	} 
	
	public int getCod() {
		return cod;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void deposit() {
		deposit = input.nextDouble();
		this.balance += deposit;
	}
	
	public void withdraw() {
		withdraw = input.nextDouble();
		double updatew = withdraw + 5;
		this.balance -= updatew;
	}
	public String toString() {
		return "Account " +
				cod + 
				", Houder: " + 
				name +
				", Balance: $" +
				String.format("%.2f",balance);
	}
}
