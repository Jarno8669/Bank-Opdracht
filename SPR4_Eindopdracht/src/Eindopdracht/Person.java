package Eindopdracht;

public class Person {

	private String name;
	private int age;
	private String bsn;
	public Account account;

	public Person(String bsn, String name, int age) {
		this.bsn = bsn;
		this.age = age;
		this.name = name;
		System.out.println("Account aangemaakt.");
	}

	public boolean equals(Object o) {
		return false;
	}

	public int hashCode() {

		return age;

	}
}