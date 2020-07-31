package main;

import java.util.Scanner;

import client.Client;
import menu.Menu;
import menu.MenuItem;

public class FinalProjectBoo {

	public static void main(String[] args) {

		//Create and display menu and capture client's selection
		Menu mainMenu = new Menu();
		MenuItem clientSelection = mainMenu.displayMenu();
		
		
		//display option to add guest and capture clients input
		int additionalGuest = mainMenu.addGuest();
		int additionalGuestCost = clientSelection.getTotalGuestPrice(additionalGuest);
		
		
		//Display sub total + cost for additional guest = total cost
		System.out.println("");
		System.out.println("Subtotal: $ " + clientSelection.getBasePrice());
		System.out.println("Cost for additional guest: $ " + additionalGuestCost);
		int totalCost = clientSelection.getBasePrice() + additionalGuestCost;
		System.out.println("");
		System.out.println("Total cost: $ " + totalCost);
		System.out.println("");
			
		
		//Capture client information
		System.out.println("RESERVATION INFORMATION: ");
		System.out.println("=========================================");
		
		
		//Capture client name
		System.out.println("Please ENTER your name: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		
		//Capture client email
		System.out.println("Please ENTER your email: ");
		Scanner input1 = new Scanner(System.in);
		String email = input1.nextLine();
		
		//Capture event date
		System.out.println("Please ENTER event date: ");
		Scanner input2 = new Scanner(System.in);
		String date = input2.nextLine();
		System.out.println("");
		
		
		//Generate random # for confirmation display
		int min = 10000;
		int max = 90000;
		int confirmation = (int)(Math.random() * (max - min + 1) + min);
		System.out.println("confirmation number: " + confirmation);

		//Display reservation information back to client
		Client newClient = new Client(name, email, date, confirmation);
		newClient.display();

	}	

}