package client;

//Parent class representing a person
public class Person {

	public String name;
	public String email;
	public String date;
	
	public Person(String name, String email, String date) {
		this.name = name;
		this.email = email;
		this.date = date;
		
	}
	
	public void displayNameAndEmail() {
		System.out.println("Thank you for booking with Boo's Party Salon, below is your confirmation!");
		System.out.println("");
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Event Date: " + date);
	}
	
}
