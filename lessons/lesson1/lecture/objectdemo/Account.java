package lesson1.lecture.objectdemo;

import java.util.Random;

public class Account {
	private String id;
	private double balance = 0.0;
	
	Account() {
		id = generateId();
	}
	
	public void updateBalance(double amount) {
		balance += amount;
	}
	public double getBalance() {
		return balance;
	}
	
	public String getId() {
		return id;
	}
	
	private String generateId() {
		//in reality, read from a database or
		//external data source
		Random random = new Random();
		return ""+random.nextInt(1000,9999);
		//return "" + RandomNumbers.getRandomInt(1000,9999);
	}
	
	
}
