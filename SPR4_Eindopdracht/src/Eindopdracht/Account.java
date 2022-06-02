package Eindopdracht;

public abstract class Account {
	protected double balance = 0;
	protected int accountNr;
	public static int nextAccountNr = 1000;

	public void deposit(double amount) {
	    if(amount >= 0) {	
	    	balance += amount;
	    }
	}
	public boolean withdraw(double amount) {
		if(amount > 0 && balance >= amount) {	
		}
		balance -= amount;
		return true;
	}

	public Account() {
		accountNr = nextAccountNr;
		nextAccountNr++;
	}

}