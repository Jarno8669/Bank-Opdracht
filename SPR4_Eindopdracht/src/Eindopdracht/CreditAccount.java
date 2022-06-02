package Eindopdracht;

import java.util.Random;

public class CreditAccount extends Account {

	private double creditLimit = 1000;
	private double creditAmount;
	private int securityCode;
	private Random r = new Random();

	public void CreditAccount() {
	}

	public void getSpendingLimit() {
	}

	public void payCredit() {
	}

	public boolean withdraw(double amount) {
		System.out.println();
		System.out.println("[-] Je kan geen geld opnemen van een credit account. [-]");
		System.out.println("");
		return false;
	}

}
