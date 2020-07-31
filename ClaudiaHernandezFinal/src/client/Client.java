package client;

//class representing a client. this is a subclass of Person(inherits Persons)
public class Client extends Person{

	int confirmation;
	
	
	public Client(String name, String email, String date,int confirmation) {
		super(name, email, date);
		this.confirmation = confirmation;
				
	}
	
	public void display() {
		displayNameAndEmail();
		System.out.println("Confirmation number: " + confirmation);
	}
	
}
