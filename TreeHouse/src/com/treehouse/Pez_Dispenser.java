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
	
	// fills the pez, this method will fill the pez to 12 disregarding how many pez are 
		// in it already
	public void fill () {
		fill(MAX_PEZ);
	}
	
	// takes out 1 pez each time the method is called. Print statement was added to show
		// where we are in the pez count
	public boolean dispense() {
		boolean wasDispensed = false;
		if (!isEmpty()) {
			System.out.println(pezCount);
			pezCount--;
			wasDispensed = true;
		}
		return wasDispensed;
	}
	// fills the pez based on the current pez count, only fills what is needed in order 
		// to reach MAX_PEZ count
	public void fill (int pezAmount) {
		int newAmount = pezCount + pezAmount;
		if (newAmount > MAX_PEZ) {
			throw new IllegalArgumentException("Too many Pez.");
		}
		pezCount = newAmount;
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

































