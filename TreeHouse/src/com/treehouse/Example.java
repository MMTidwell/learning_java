package com.treehouse;

public class Example {
	public static void main (String[] args) {
		System.out.println("We are making a new PEZ Dispenser.");
		System.out.printf("Fun fact there are %d allowed in every dispenser. %n", Pez_Dispenser.MAX_PEZ);
		
		// since pez_dispenser is in the same package we do not need to import it
		Pez_Dispenser dispenser = new Pez_Dispenser("Donatello");
		// Reassigns the characterName
		// dispenser.characterName = ("Darth Vader"); // no longer works due to private call
		
		System.out.printf("The dispensers name is %s. %n", dispenser.getCharacterName());
		
		// checks to see if the dispenser is empty by using the isEmpty method from Pez_Dispenser
		if (dispenser.isEmpty()) {
			System.out.println("Dispenser is empy.");
		}
		
		System.out.println("Filling the dispenser with PEZ..");
		// calls the fill method from Pez_Dispenser 
		dispenser.fill();
		
		// checks to see if the dispenser is empty by using the isEmpty method from Pez_Dispenser
		if (!dispenser.isEmpty()) {
			System.out.println("Dispenser is full.");
		}
		
		// String before = dispenser.swapHead("Darth Vader");
		// System.out.printf("It was %s but Chris changed it to %s. %n", before, dispenser.getCharacterName());
	}
}