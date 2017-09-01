//package com.treehouse;
//
//public class Pez_Dispenser {
//	// if we set this variable to "private" then we can not change the value of the variable
//	// final will not allow the value of the variable to be changed
//	final private String characterName;
//	// constant
//	public static final int MAX_PEZ = 12;
//	// store how many pez are in the dispenser
//	private int pezCount;
//	
//	
//	// Gives access to be able to change the characerName value
//	public Pez_Dispenser(String characterName) {
//		this.characterName = characterName;
//		pezCount = 0;
//	}
//	
//	// This will allow access to the characterName String
//	public String getTheCharacterName() {
//		return characterName;
//	}
//	
//	// fills the Pez Dispenser
//	public void fill() {
//		fill(MAX_PEZ);
//	}
//	
//	// fills the pez 
//	public void fill(int pezAmount) {
//		int newAmount = pezCount + pezAmount;
//		if (newAmount > MAX_PEZ) {
//			throw new IllegalArgumentException("Too many PEZ!!");
//		}
//		pezCount = newAmount;
//	}
//	
//	public boolean dispense() {
//		boolean wasDispensed = false;
//		if (!isEmpty()) {
//			pezCount--;
//			wasDispensed = true;
//		}
//		return wasDispensed;
//	}
//
//	public boolean isEmpty() {
//		return pezCount == 0; 
//	}
//}

package com.treehouse;

class Pez_Dispenser {
	// constant -> value can not change and the naming is capitalized
	// static -> how the variable is stored in memory, and allows the ability to have variables
		// and methods directly off the class instead of the instance
	public static final int MAX_PEZ = 12; 
	// final -> will not allow the variable to change after it is set
	final private String characterName;
	private int pezCount;
	
	// Constructor, will have the same name as the class
	public Pez_Dispenser (String characterName) {
		// this -> refers to the characterName that is passed into the constructor
		this.characterName = characterName;
		pezCount = 0;
	}
	
	// public -> allows access to method
	// String -> type of data that will be returned
	// getCharacterName -> method name
		// get in the name shows it is a getter
	// () -> states that it is a method that will be called, and can contain parameters
	public String getCharacterName () {
		return characterName;
	}
	
	// fills the pez
	public void fill () {
		pezCount = MAX_PEZ;
	}
	
	// checks if the pez dispenser is empty or not, if it is then it will return 0
	public boolean isEmpty () {
		return pezCount == 0;
	}
	
// changes the character head
//	public String swapHead (String characterName) {
//		String originalCharacterName = this.characterName;
//		this.characterName = characterName;
//		return originalCharacterName;
//	}
}

































