package Eindopdracht;

import java.util.ArrayList;

public class Bank {
	private static ArrayList<Account> accounts = new ArrayList<Account>();
	private String name;

	public Bank(String name) {
		this.name = name;
	}

	public boolean transfer(int fromAccountNr, int toAccountNr, int amount) {
		Account fromAccount = getAccountByNr(fromAccountNr);
		Account toAccount = getAccountByNr(toAccountNr);
		if (fromAccount != null && toAccount != null && amount > 0) {
			boolean withdrawSucces = fromAccount.withdraw(amount);
			if (withdrawSucces == true) {
				toAccount.deposit(amount);
			}
		}

		return false;
	}

	public Account getAccountByNr(int accountNr) {

		for (int i = 0; i < accounts.size(); i++) {
			Account account = accounts.get(i);
			if (account.accountNr == accountNr) {
				return account;
			}
		}
		return null;
	}

	public void registerAccount(Person person, String type) {
		if (type.equals("C")) {
			CreditAccount NieuwCredit = new CreditAccount();
			accounts.add(NieuwCredit);
		} else {
			BankAccount NieuwBank = new BankAccount();
			accounts.add(NieuwBank);
			return;
		}
	}
}