package menu;

import java.util.Scanner;

public class Menu {

	public Menu() {

	}
	
	//Create each menu item and display them to the client and capture clients choice
	public MenuItem displayMenu() {

		System.out.println(" Welcome to Boo's Party Salon!  ");
		System.out.println(" We offer 3 pampering packages which includes 8 guests. ");
		System.out.println(
				" They will have the best expierence with matching robes and disposable slippers and two pampering assistances. ");
		System.out.println("");
		System.out.println("Menu Options: ");
		System.out.println("");
		
		
		DivaPackage itemOne = new DivaPackage();
		GlamPackage itemTwo = new GlamPackage();
		VipPackage itemThree = new VipPackage();

		MenuItem[] allMenuItems = new MenuItem[3];
		allMenuItems[0] = itemOne;
		allMenuItems[1] = itemTwo;
		allMenuItems[2] = itemThree;

		//Looping to display packages, details and prices
		for (int i = 0; i < 3; i++) {

			System.out
					.println((i + 1) + ")" + " $" + allMenuItems[i].getBasePrice() + ": " + allMenuItems[i].getName());
			System.out.println(allMenuItems[i].getDetails());
			System.out.println("Additional guest price: $" + allMenuItems[i].getAddOnPrice());
			System.out.println("");

		}
		
		// Capture client input - return object type: of 1, 2, 3
		System.out.println("1 - Diva Package ");
		System.out.println("2 - Glam Package ");
		System.out.println("3 - Vip Package  ");
		System.out.println("" );
		System.out.println("Please ENTER 1, 2, or 3 for your package selection:");
		Scanner input = new Scanner(System.in);
		int clientSelection = input.nextInt();
		//1input.close();

		//Switch statement to capture user's package choice
		switch (clientSelection) {
		case 1:
			System.out.println("");
			System.out.println("You selected: " + itemOne.getName());
			
			return itemOne;
		case 2:
			System.out.println("");
			System.out.println("You selected: " + itemTwo.getName());

			return itemTwo;
		case 3:
			System.out.println("");
			System.out.println("You selected: " + itemThree.getName());
			
			return itemThree;
		default:
			System.out.println("");
			System.out.println("You did not enter a VALID selection: ");
			return null;

		}

	}

	//Capture addGuest to the client and display 
	public int addGuest() {
		System.out.println("Please enter any additional guest: ");
		Scanner input = new Scanner(System.in);
		int addGuest = input.nextInt();
		System.out.println("You added " + addGuest + " additional guests");
		
		return addGuest;
	}

}
