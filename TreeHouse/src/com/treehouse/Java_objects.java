package com.treehouse;

public class Java_objects {
	public static void main (String[] args) {
		System.out.println("We are making a new PEZ Dispenser.");
		
		// Pulls in the Pez_Dispenser.java class with out importing because it is in the same Package
		// new Pez_Dispenser(); creates a child of Pez_Dispenser
		Pez_Dispenser dispenser = new Pez_Dispenser("Donatello");
		System.out.printf("The dispenser is %s. %n", dispenser.getTheCharacterName());
		
		// We can change or override the contents of the variable
//		dispenser.getTheCharacterName() = "Darth Vader";
//		System.out.printf("The dispenser is %s.", dispenser.getTheCharacterName());
	}
}