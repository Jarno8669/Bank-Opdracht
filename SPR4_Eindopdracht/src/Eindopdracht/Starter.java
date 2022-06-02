package Eindopdracht;

public class Starter {

	public static void main(String[] args) {

// Accounts aanmaken
		Bank Rabobank = new Bank("Bank");
		Person NieuwPerson = new Person("1111", "Jarno", 17);
		Person NieuwPerson2 = new Person("2222", "Blijebaby", 7);
		Person NieuwPerson3 = new Person("3333", "blijblij", 3);
		Rabobank.registerAccount(NieuwPerson, "C");
		Rabobank.registerAccount(NieuwPerson2, "B");
		Rabobank.registerAccount(NieuwPerson3, "B");

		System.out.println("--------------------------");

// Printen hoeveel geld
		System.out.println("Hoeveelheid geld.");
		System.out.println(Rabobank.getAccountByNr(1000).balance + " | Account 1000");
		System.out.println(Rabobank.getAccountByNr(1001).balance + " | Account 1001");
		System.out.println(Rabobank.getAccountByNr(1002).balance + " | Account 1002");

		System.out.println("--------------------------");

		System.out.println("Geld storten.");
// Geld storten
		Rabobank.getAccountByNr(1000).deposit(100);
		Rabobank.getAccountByNr(1001).deposit(1020);
		Rabobank.getAccountByNr(1002).deposit(1020);
		System.out.println(Rabobank.getAccountByNr(1000).balance + " | Account 1000");
		System.out.println(Rabobank.getAccountByNr(1001).balance + " | Account 1001");
		System.out.println(Rabobank.getAccountByNr(1002).balance + " | Account 1002");

		System.out.println("--------------------------");

		System.out.println("Geld eraf halen.");
// Geld eraf halen
		Rabobank.getAccountByNr(1000).withdraw(20);
		Rabobank.getAccountByNr(1001).withdraw(20);
		Rabobank.getAccountByNr(1002).withdraw(20);
		System.out.println(Rabobank.getAccountByNr(1000).balance + " | Account 1000");
		System.out.println(Rabobank.getAccountByNr(1001).balance + " | Account 1001");
		System.out.println(Rabobank.getAccountByNr(1002).balance + " | Account 1002");

		System.out.println("--------------------------");

		System.out.println("Geld overmaken.");
// Geld overmaken
		Rabobank.transfer(1001, 1002, 34);
		System.out.println(Rabobank.getAccountByNr(1001).balance + " | Account 1001");
		System.out.println(Rabobank.getAccountByNr(1002).balance + " | Account 1002");

		System.out.println("--------------------------");

	}
}
